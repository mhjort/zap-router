(ns zap-router.core
  (:require [aleph.tcp :as tcp]
            [clojure.core.async :as a]
            [manifold.stream :as s]))

(def config (atom {:players {}}))

(defn- register! [player stream main-stream]
  (println "Registering player" player "with stream" stream)
  (let [{:keys [players]} (swap! config #(update-in % [:players] assoc player stream))]
    (when (= 2 (count players))
      (println "Players registered")
      (s/put! main-stream (.getBytes "player1:START:player2" "UTF-8"))
      (s/put! main-stream (.getBytes "player2:START:player1" "UTF-8")))))

(defn echo-handler [player-id main-stream player-stream info]
  (register! (keyword (str "player" (swap! player-id inc))) player-stream main-stream)
  (s/connect player-stream main-stream))

(defn run [port]
  (let [player-id (atom 0)
        main-stream (s/stream)
        server (tcp/start-server (partial echo-handler player-id main-stream) {:port port})]
    (println "ZapRouter Running")
    (a/go-loop []
               (try
                 (let [input @(s/take! main-stream)
                       [target cmd params] (clojure.string/split (String. input "UTF-8") #":")]
                   (println "Got input" target cmd params)
                   (doseq [[player output-stream] (:players @config)]
                     (when (= (name player) target)
                       (println "Sending to" target)
                       @(s/put! output-stream (str cmd ":" params)))))
                 (catch Exception e
                   (println "Exception" e)))
               (recur))
    server))

(defn -main [& args]
  (let [signal (java.util.concurrent.CountDownLatch. 1)]
    (run 10001)
    (.await signal)))

 ;     (.close (tcp/start-server (partial echo-handler :player1 :player2 (s/stream)) {:port 10004}))

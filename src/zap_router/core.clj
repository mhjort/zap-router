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

(defn echo-handler [player opponent main-stream player-stream info]
  (register! player player-stream main-stream)
  (s/connect player-stream main-stream))

(defn run []
  (let [main-stream (s/stream)]
    (println "ZapRouter Running")
    (future
      (tcp/start-server (partial echo-handler :player1 :player2 main-stream) {:port 10001})
      (tcp/start-server (partial echo-handler :player2 :player1 main-stream) {:port 10002}))
    (loop []
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
      (recur))))

(defn -main [& args]
  (run))

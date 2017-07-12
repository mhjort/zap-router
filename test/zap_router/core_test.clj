(ns zap-router.core-test
  (:require [clojure.test :refer :all]
            [clojure.core.async :refer [go go-loop >! <!!] :as a]
            [zap-router.core :as zap-server]
            [zap-router.client :as zap-client]))

(deftest start-and-stop
  (let [server (zap-server/run 10005)
        client1 (zap-client/connect "localhost" 10005)
        client2 (zap-client/connect "localhost" 10005)]
    (is (= "START:player2" (zap-client/read-msg! (first client1))))
    (is (= "START:player1" (zap-client/read-msg! (first client2))))
    (.close server)))



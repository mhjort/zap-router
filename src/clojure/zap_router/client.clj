(ns zap-router.client
  (:require [aleph.tcp :as tcp]
            [clojure.core.async :refer [go go-loop >! <!!] :as a]
            [manifold.stream :as s]))

(defn connect [host port]
  (let [in (a/chan)
        out (a/chan)
        sout (s/->source out)
        c @(tcp/client {:host "localhost" :port port})]
    (s/consume #(a/put! in %) c) ;TODO Use consume-async instead
    (s/connect sout c)
    [in out]))

(defn send-msg [out target msg arg]
  (go (>! out (.getBytes (str target ":" msg ":" arg) "UTF-8"))))

(defn read-msg! [in]
  (let [raw (<!! in)
        response (zaprouter.Connection$RegisterResponse/parseFrom raw)]
    response))

(defproject zap-router "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.3.442"]
                 [aleph "0.4.3"]
                 [com.google.protobuf/protobuf-java "3.3.1"]]
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :main zap-router.core)


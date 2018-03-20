(ns zookeeper-health-check.core
  (:require [zookeeper :as zk])
  (:import [java.lang IllegalStateException])
  (:gen-class))

(defn- test-connect
  "Function that returns true if it achieves a successful connection to the zookeeper hostname and port that is sent to it."
  [zk-host]
  (try
    (with-open [client (zk/connect zk-host)]
      (= (zk/state client) :CONNECTED))
    (catch IllegalStateException e
      false)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defproject zookeeper-health-check "0.1.0-SNAPSHOT"
  :description "AWS Lambda Function for checking the health of all Apache Zookeepers in a Zookeeper cluster."
  :url "https://github.com/timotheosh/zookeeper-health-check"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [zookeeper-clj "0.9.4"]]
  :main ^:skip-aot zookeeper-health-check.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

(defproject minimal-example "0.0.1-SNAPSHOT"
  :description "Minimal example"
  :license "UNLICENSED"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [io.pedestal/pedestal.service "0.5.7"]
                 [io.pedestal/pedestal.jetty "0.5.7"]
                 [ch.qos.logback/logback-classic "1.2.3" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.26"]
                 [org.slf4j/jcl-over-slf4j "1.7.26"]
                 [org.slf4j/log4j-over-slf4j "1.7.26"]
                 [com.cognitect.aws/api "0.8.352"]]
  :resource-paths ["config", "resources"]
  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "minimal-example.server/run-dev"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.5.7"]]}
             :uberjar {:aot [minimal-example.server]}}
  :main ^{:skip-aot true} minimal-example.server)

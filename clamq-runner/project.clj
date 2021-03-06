(defproject clamq/clamq-runner "0.5-SNAPSHOT"
 :description "Clojure APIs for Message Queues"
 :dependencies [[org.slf4j/slf4j-api "1.6.1"]
                [org.slf4j/slf4j-simple "1.6.1"]
                [clamq/clamq-activemq "0.5-SNAPSHOT"]
                [clamq/clamq-rabbitmq "0.5-SNAPSHOT"]]
 :aot [clamq.runner.main]
 :main clamq.runner.main)
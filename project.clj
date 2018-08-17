(defproject chessapi "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[cheshire "5.8.0"]
                [clj-http "3.9.1"]
                [com.walmartlabs/lacinia "0.21.0"]
                [com.walmartlabs/lacinia-pedestal "0.9.0"]
                [io.pedestal/pedestal.service "0.5.4"]
                [io.pedestal/pedestal.jetty "0.5.4"]
                [ch.qos.logback/logback-classic "1.2.3" :exclusions [org.slf4j/slf4j-api]]
                [org.slf4j/jul-to-slf4j "1.7.25"]
                [org.slf4j/jcl-over-slf4j "1.7.25"]
                [org.slf4j/log4j-over-slf4j "1.7.25"]]
 :min-lein-version "2.0.0"
 :resource-paths ["config", "resources"])
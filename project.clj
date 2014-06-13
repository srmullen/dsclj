(defproject dsclj "0.1.0-SNAPSHOT"
  :description "Data Structures for Clojure(Script)"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2227"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :cljsbuild {
              :builds [{
                        :src-paths ["src"]
                        :compiler {
                                   :output-to "war/javascripts/main.js"}}]}
  ;:source-paths ["src"]
  :main dsclj.core)

(defproject antlr-check "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-beta1"]
                 [org.antlr/antlr4-runtime "4.7"]
                 [org.antlr/antlr4 "4.7"]]

  :java-source-paths ["src/java"]
  :main ^:skip-aot antlr-check.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})


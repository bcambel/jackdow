(defproject jackdaw.stackoverflow "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/data.xml "0.0.8"]
		; [org.clojure/clojure.zip "0.1."]
                ]
  :main ^:skip-aot jackdaw.stackoverflow
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
(defproject my-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
	[org.clojure/clojure "1.5.1"]
	[org.clojure/clojure-contrib "1.2.0"]
  ]
  :plugins [
	[lein2-eclipse "2.0.0"]
  ]
  :main my-app.core
  :profiles {:uberjar {:aot :all}}
)

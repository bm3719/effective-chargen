(defproject effective-chargen "0.1.0-SNAPSHOT"
  :description "A generic character generation library."
  :url "https://github.com/bm3719/effective-chargen"
  :license {:name "GNU General Public License Version 3"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [metosin/malli       "0.8.9"]]
  :repl-options {:init-ns user}
  :global-vars {*print-length* 100}
  :deploy-branches ["master"]
  :main effective-chargen.core
  :profiles {:dev {:resource-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "1.3.0"]]}})

;;;; This is a dev namespace to contain utility functions useful for
;;;; interacting with the data at the REPL, or for general development.

(ns user
  (:require [clojure.pprint :refer [pp pprint print-table]]
            [clojure.tools.namespace.repl :refer [refresh]]
            [effective-chargen.core :as core]))

(def lst '())

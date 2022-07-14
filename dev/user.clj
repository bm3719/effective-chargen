;;;; This is a dev namespace to contain utility functions useful for
;;;; interacting with the data at the REPL, or for general development.

(ns user
  (:require [clojure.pprint :refer [pp pprint print-table]]
            [clojure.tools.namespace.repl :refer [refresh]]
            [malli.core :as m]
            [effective-chargen.core :as core]
            [effective-chargen.schema :as schema]))

(def char1
  {:first-name "Bruce"
   :nick-name "Bronk"
   :last-name "Miller"
   :age 28
   :level 1
   :max-hp 4
   :max-mp 8
   :str 8
   :dex 10
   :con 8
   :int 18
   :wis 13
   :cha 12})

;; (m/validate schema/Char char1)

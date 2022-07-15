;;;; This is a dev namespace to contain utility functions useful for
;;;; interacting with the data at the REPL, or for general development.

(ns user
  (:require [clojure.pprint :refer [pp pprint print-table]]
            [clojure.tools.namespace.repl :refer [refresh]]
            [malli.core :as m]
            [effective-chargen.core :as core]
            [effective-chargen.data :as data]
            [effective-chargen.schema :as schema]
            [effective-chargen.generator :as gen]))

(def static-char-1
  {;; :id 0001234567
   :first-name "Bruce"
   :nick-name "Bronk"
   :last-name "Miller"
   :sex :male
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

;; (m/validate schema/base-char static-char-1)

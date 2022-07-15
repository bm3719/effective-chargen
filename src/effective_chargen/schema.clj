(ns effective-chargen.schema
  (:require [effective-chargen.data :as data]
            [malli.core :as m]
            [malli.error :as me]))

(defn humaxplain
  "Convenience composition of humanize and explain."
  [schema value]
  ((comp me/humanize m/explain) schema value))

;;; Predicates

(defn elem?
  "Predicate form of being an element of a set." [set e]
  (not (nil? (set e))))

;;; Main character schema: Represents that which a character must have.
;;;
;;; TODO: This is just a rough draft, based on basic fantasy char stats.
;;; Rework and add additional schemas later, and add a deep-merge function that
;;; composes them.
(def base-char
  [:and
   [:map
    ;; [:id [:and pos? ]]
    [:first-name string?]
    [:nick-name string?]
    [:last-name string?]
    [:sex [:fn {:error/message "Should be: :male|:female|:intersex"}
           #(elem? (data/set-from data/w-sexes) %)]]
    [:age nat-int?]
    [:level pos?]
    [:max-hp pos?]
    [:max-mp pos?]
    [:str nat-int?]
    [:dex nat-int?]
    [:con nat-int?]
    [:int nat-int?]
    [:wis nat-int?]
    [:cha nat-int?]]])

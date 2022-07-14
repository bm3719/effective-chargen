(ns effective-chargen.schema
  (:require [malli.core :as m]
            [malli.error :as me]))

(defn humaxplain
  "Convenience composition of humanize and explain."
  [schema value]
  ((comp me/humanize m/explain) schema value))

;;; Main character schema: Represents that which a character must have.
;;;
;;; TODO: This is just a rough draft, based on basic fantasy char stats.
;;; Rework and add additional schemas later, and add a deep-merge function that
;;; composes them.
(def Char
  [:and
   [:map
    [:first-name string?]
    [:nick-name string?]
    [:last-name string?]
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

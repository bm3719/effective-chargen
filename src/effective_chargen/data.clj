(ns effective-chargen.data)

;;; Transform functions.

(defn set-from
  "Get a simple set from a weighted map." [m]
  (into #{} (keys m)))

;;; Helper functions

(defn valid-p-sum?
  "Predicate to check if the total p-values of a weighted map equal 1." [m]
  (= 1.0 (apply + (vals m))))

;;; Directly defined weighted/frequency maps.

(def w-sexes
  {:male 0.499
   :female 0.499
   :intersex 0.002})

;;; Static sets, unweighted.

(def surnames
  #{"Ashworth" "Bass" "Bedgood" "Bennett" "Buchio" "Chavis" "Cole" "Collins"
    "Davis" "Dial" "Doyle" "Dyess" "Garland" "Gibbs" "Gibson" "Goings"
    "Green" "Hall" "Hyatt" "James" "Johnson" "Keith" "Lacey" "Maddox" "Mayo"
    "Minors" "Mullins" "Moore" "Nash" "Nelson" "Orr" "Perkins" "Pinder"
    "Rivers" "Short" "Smiling" "Strother" "Sweat" "Thompson" "Ware" "White"
    "Willis" "Wisby" "Faraday" "Swathe" "Smith" "Reed"})

(def male-first-names
  #{"Eener" "Meretrix" "Phils" "Gaz" "Zener" "Zephid" "Mils" "Morkin" "Helvun"
    "Brno" "Killian" "Maxfeld" "Oberon" "Vaughn" "Lowen" "Agnar" "Alain"
    "Aleck" "Alviss" "Peck" "Pentyn"})

(def female-first-names
  #{"Evelyn" "Esther" "Maude" "Gayle" "Phylida" "Pique" "Aisla" "Abiri"
    "Callista" "Fern" "Astrid" "Isolde" "Imogen" "Imara" "Glynn" "Minu"
    "Montserrat" "Millicent" "Primrose" "Zosia" "Tegan" "Wren" "Elsie"
    "Peksa"})

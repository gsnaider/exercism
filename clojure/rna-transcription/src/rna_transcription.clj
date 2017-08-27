(ns rna-transcription
  (:require [clojure.string :as str])
)

(def rna-complements 
  { "G" "C", "C" "G", "T" "A", "A" "U" }
)

(defn- complement-rna [x]
  (if (contains? rna-complements (str x))
    (get rna-complements (str x))
    (throw (AssertionError. "Wrong input."))
  )
)

(defn to-rna 
  "Returns the RNA complement of a DNA strand."
  [dna]
  (str/join (map complement-rna dna))
)

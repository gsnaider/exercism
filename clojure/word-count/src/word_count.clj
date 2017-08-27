(ns word-count
  (:require [clojure.string :as str])
)

(defn word-count 
  "Returns a map containing each word in words as key, and the number of occurrences of that word as values."
  [words]
    (frequencies
      (str/split 
        (str/replace 
          (str/join 
            (re-seq #"[a-z0-9 ]"  
                (str/lower-case words)
            )
          )
          #" +" " "
        )
      #" "
      )
    )
)


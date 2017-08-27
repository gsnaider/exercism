(ns bob
  (:require [clojure.string :as str])
)

(defn- is-empty
  [statement]
  (str/blank? statement)
)

(defn- is-shout
  [statement]
  (and (= statement (str/upper-case statement)) (not= statement (str/lower-case statement)) )
)

(defn- is-question
  [statement]
  (str/ends-with? statement "?")
)

(defn response-for
  "Returns bob response."
  ([statement]
    (if (is-empty statement)
      "Fine. Be that way!"
      (if (is-shout statement)
        "Whoa, chill out!"
        (if (is-question statement)
          "Sure."
          "Whatever."
        )
      )
    )
  )
)
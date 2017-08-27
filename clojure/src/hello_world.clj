(ns hello-world)

(defn hello
  "Says hello."
  ([]
    (hello "World")
  )
  ([x]
    (str "Hello, " x "!") 
  )
)
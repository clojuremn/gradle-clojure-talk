(ns example.core)

(defn greetings [name]
  (str "Greetings " name "!"))

(defn exclaim? [x]
  (.endsWith x "!"))

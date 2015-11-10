(ns prob-spec.get-caps)

(defn get-caps
  "Gets the capital letters from a string"
  [input]
  (apply str (re-seq #"[A-Z]" input)))

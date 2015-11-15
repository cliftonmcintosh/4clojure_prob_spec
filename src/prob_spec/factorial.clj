(ns prob-spec.factorial)

(defn factorial
  [x]
  (reduce * (range 1 (+ x 1))))

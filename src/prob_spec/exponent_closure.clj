(ns prob-spec.exponent-closure)

(defn exp-closure [n]
  (fn [x]
    (reduce * (repeat n x))))

(ns prob-spec.comparisons)

(defn comparison [op x y]
  (cond
    (op y x) :gt
    (op x y) :lt
    :else :eq))

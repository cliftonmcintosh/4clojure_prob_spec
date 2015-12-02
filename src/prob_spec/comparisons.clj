(ns prob-spec.comparisons)

(defn comparison [op x y]
  (cond
   (and (not (op x y)) (not (op y x))) :eq
   (not (op x y)) :gt
   :else :lt))

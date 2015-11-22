(ns prob-spec.half-truth)

(defn half-truth
  [& xs]
  (if
    (and (some true? xs) (some false? xs)) true
                                           false))

(ns prob-spec.reverse-interleave)

(defn rev-interleave
  [xs point]
  (let [partitioned (partition point xs)
        helper (fn [coll accum]
            (if (every? empty? coll)
              accum
              (recur (map rest coll)
                     (conj accum (map first coll)))))]
    (helper partitioned [])))

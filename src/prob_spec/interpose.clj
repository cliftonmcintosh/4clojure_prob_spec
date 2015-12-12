(ns prob-spec.interpose)

(defn my-interpose
  [interposer coll]
  (loop [x interposer
         xs coll
         accum []]
    (cond
      (empty? xs) accum
      (= (count xs) 1) (conj accum (first xs))
      :else (recur x (rest xs) (conj accum (first xs) x)))))

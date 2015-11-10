(ns prob-spec.flatten)


(defn my-flatten
  [coll]
  (let [left (first coll)
        right (next coll)]
    (concat
      (if (sequential? left)
        (my-flatten left)
        [left])
      (when (sequential? right)
        (my-flatten right)))))

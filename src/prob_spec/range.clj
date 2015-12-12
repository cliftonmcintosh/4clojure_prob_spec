(ns prob-spec.range)

(defn my-range
  ([start end] (my-range start end []))
  ([start end accum]
   (if (>= start end)
     accum
     (recur (inc start) end (conj accum start)))))

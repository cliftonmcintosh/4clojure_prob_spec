(ns prob-spec.replicate-sequence)

(defn rep-seq
  ([input num-times] (rep-seq input [] num-times))
  ([input accum num-times]
    (if (empty? input)
      accum
      (recur (rest input) (apply conj accum (repeat num-times (first input))) num-times))))

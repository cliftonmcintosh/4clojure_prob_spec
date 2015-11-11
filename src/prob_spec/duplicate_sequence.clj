(ns prob-spec.duplicate-sequence)

(defn dup-seq
  ([input] (dup-seq input []))
  ([input accum]
    (if (empty? input)
      accum
      (recur (rest input) (conj accum (first input) (first input))))))

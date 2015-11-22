(ns prob-spec.interleave)

(defn my-interleave
  [x y]
  (flatten (map #(conj [] %1 %2) x y)))
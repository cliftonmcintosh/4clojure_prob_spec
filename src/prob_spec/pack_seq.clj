(ns prob-spec.pack-seq)

(defn pack
  [input]
  (partition-by identity input))

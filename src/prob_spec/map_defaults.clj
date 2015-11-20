(ns prob-spec.map-defaults)

(defn map-defaults
  [value the-seq]
  (zipmap the-seq (take (count the-seq) (iterate identity value))))
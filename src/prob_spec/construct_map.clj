(ns prob-spec.construct-map)

(defn construct-map
  [x y]
  (apply merge (map #(assoc {} %1 %2) x y)))

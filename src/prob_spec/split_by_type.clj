(ns prob-spec.split-by-type)

(defn split-by-type [xs]
  (map second (group-by type xs)))

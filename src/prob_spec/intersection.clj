(ns prob-spec.intersection)

(defn my-intersection
  [xs ys]
  (into #{} (filter #(contains? xs %) ys)))

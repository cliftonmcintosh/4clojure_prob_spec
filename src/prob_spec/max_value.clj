(ns prob-spec.max-value)

(defn max-value
  [x & xs]
  (reduce (fn [y z]
            (if (> y z) y z)) x xs))

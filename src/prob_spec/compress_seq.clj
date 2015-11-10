(ns prob-spec.compress-seq)

;(defn compress
;  "Removes consecutive duplicates from a sequence"
;  [input]
;  (when-let [[head & tail] (seq input)]
;    (if (= head (first tail))
;      (compress tail)
;      (cons head (compress tail)))))

(defn compress
  "Removes consecutive duplicates from a sequence"
  [input]
  (map first (partition-by identity input)))

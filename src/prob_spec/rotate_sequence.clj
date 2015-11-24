(ns prob-spec.rotate-sequence)

(defn rotate-sequence
  [pivot coll]
  (let [length (count coll)
        new-pivot (if (not (neg? pivot))
                    (if (>= length pivot) pivot (- pivot length))
                    (if (>= length (Math/abs pivot)) (+ length pivot) (+ pivot (* 2 length))))]
    (concat (drop new-pivot coll) (take new-pivot coll))))

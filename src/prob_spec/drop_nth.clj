(ns prob-spec.drop-nth)


(defn drop-every-nth
  [original index]
  (let [indexed-items (map  #(conj [] (inc (first %)) (second %)) (map-indexed vector original))]
    (->> indexed-items
      (filter (fn [input]
                (not= 0 (rem (first input) index))))
      (reduce #(conj %1 (take-last 1 %2)) [])
      (flatten))))
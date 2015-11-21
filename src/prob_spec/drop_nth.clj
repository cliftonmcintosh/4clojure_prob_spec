(ns prob-spec.drop-nth)


(defn drop-every-nth
  [coll index]
  (let [indexed-items (map  #(conj [] (inc (first %)) (second %)) (map-indexed vector coll))]
    (flatten (reduce
               #(conj %1 (take-last 1 %2)) []
               (filter (fn [input]
                         (not= 0 (rem (first input) index)))
                       indexed-items)))))


(ns prob-spec.greatest-common-divisor)

(defn divisor
  [x y]
  (let [smaller (if (< x y) x y)
        larger (if (= x smaller) y x)
        largest-possible-divisor (if (>= (/ larger smaller) 2)
                                   smaller
                                   (if (> smaller 0) (int (float (/ smaller 2))) 0))
        possibles (reverse (range (inc largest-possible-divisor)))
        finder (fn [l s candidates]
                 (let [to-check (first candidates)
                       more (rest candidates)]
                   (if (and (zero? (rem l to-check))
                            (zero? (rem s to-check)))
                     to-check
                     (recur l s more))))]
    (finder larger smaller possibles)))

(ns prob-spec.product-digits)

(defn product-digits
  [x y]
  (let [product (* x y)
        map-str #(map str %)
        map-int #(map read-string %)]
    (-> product
        str
        seq
        map-str
        map-int)))

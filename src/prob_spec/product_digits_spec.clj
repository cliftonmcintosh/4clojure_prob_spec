(ns prob-spec.product-digits-spec
  (:require [speclj.core :refer :all]
            [prob-spec.product-digits :refer [product-digits]]))

(describe "product-digits"
  (it "should handle a one-digit number"
    (should= [1] (product-digits 1 1)))
  (it "should handle a larger numbers"
    (should= [8 9 1] (product-digits 99 9)))
  (it "should handle much larger numbers"
    (should= [9 8 9 0 1] (product-digits 999 99))))

(run-specs)

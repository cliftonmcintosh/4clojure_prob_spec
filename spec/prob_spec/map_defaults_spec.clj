(ns prob-spec.map-defaults-spec
  (:require [speclj.core :refer :all]
            [prob-spec.map-defaults :refer :all]))

(describe "map-defaults"
          (it "should place an integer value as the value"
              (should= {:a 0 :b 0 :c 0} (map-defaults 0 [:a :b :c])))
          (it "should place a string value as the value"
              (should= {1 "x" 2 "x" 3 "x"} (map-defaults "x" [1 2 3])))
          (it "should place a vector value as the value"
              (should= {:foo [:a :b] :bar [:a :b]} (map-defaults [:a :b] [:foo :bar]))))

(run-specs)

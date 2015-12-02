(ns prob-spec.comparisons-spec
  (:require [speclj.core :refer :all]
            [prob-spec.comparisons :refer :all]))

(describe "comparisons"
          (it "should work with less than, 5 and 1"
              (should= :gt (comparison < 5 1)))
          (it "should yield :eq for two words whose lengths are the same"
              (should= :eq (comparison (fn [x y] (< (count x) (count y))) "pear" "plum")))
          (it "should yield :lt with a modulo of 21 and 3"
              (should= :lt (comparison (fn [x y] (< (mod x 5) (mod y 5))) 21 3)))
          (it "should yield :gt with greater than, 0 and 2"
              (should= :gt (comparison > 0 2))))

(run-specs)

(ns prob-spec.max-value-spec
  (:require [speclj.core :refer :all]
            [prob-spec.max-value :refer :all]))

(describe "max-value"
  (it "should get a max from the middle when the max is not first or last"
    (should= 8 (max-value 1 8 3 4)))
  (it "should get the first item if it is the max"
    (should= 30 (max-value 30 20)))
  (it "should get one right from the middle if that is max"
    (should= 67 (max-value 45 67 11))))

(run-specs)

(ns prob-spec.half-truth-spec
  (:require [speclj.core :refer :all]
            [prob-spec.half-truth :refer :all]))

(describe "half-truth"
          (it "should return false if all are false"
              (should-not (half-truth false false)))
          (it "should return true if one is true and one is false"
              (should (half-truth true false)))
          (it "should return false if there is only one item and it is true"
              (should-not (half-truth true)))
          (it "should return false if there is only one item and it is false"
              (should-not (half-truth false)))
          (it "should return true if one of the items is true"
              (should (half-truth false true false)))
          (it "should return false if all the items are true"
              (should-not (half-truth true true true)))
          (it "should return true if one of the items is false"
              (should (half-truth true true true false))))

(run-specs)

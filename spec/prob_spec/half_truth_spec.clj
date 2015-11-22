(ns prob-spec.half-truth-spec
  (:require [speclj.core :refer :all]
            [prob-spec.half-truth :refer :all]))

(describe "half-truth"
          (it "should return false if all are false"
              (should= false (half-truth false false)))
          (it "should return true if one is true and one is false"
              (should= true (half-truth true false)))
          (it "should return false if there is only one item and it is true"
              (should= false (half-truth true)))
          (it "should return false if there is only one item and it is false"
              (should= false (half-truth false)))
          (it "should return true if one of the items is true"
              (should= true (half-truth false true false)))
          (it "should return false if all the items are true"
              (should= false (half-truth true true true)))
          (it "should return true if one of the items is false"
              (should= true (half-truth true true true false))))

(run-specs)

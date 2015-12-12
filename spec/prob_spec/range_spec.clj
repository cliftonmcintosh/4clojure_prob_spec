(ns prob-spec.range-spec
  (:require [speclj.core :refer :all]
            [prob-spec.range :refer :all]))

(describe "my-range"
  (it "should make a sequence of positive numbers starting with one"
    (should= '(1 2 3) (my-range 1 4)))
  (it "should make a sequence of numbers when starting with a negative number"
    (should= '(-2 -1 0 1) (my-range -2 2)))
  (it "should make a sequence of numbers when starting with a positive number greater than one"
    (should= '(5 6 7) (my-range 5 8))))

(run-specs)

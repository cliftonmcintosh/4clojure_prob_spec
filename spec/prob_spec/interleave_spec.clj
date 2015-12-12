(ns prob-spec.interleave-spec
  (:require [speclj.core :refer :all]
            [prob-spec.interleave :refer :all]))

(describe "my-interleave"
  (it "should join two sequences of equal length"
    (should= '(1 :a 2 :b 3 :c) (my-interleave [1 2 3] [:a :b :c])))
  (it "should join two sequences of unequal length by dropping the extra elements from the longer sequence when the first sequence is shorter"
    (should= '(1 3 2 4) (my-interleave [1 2] [3 4 5 6])))
  (it "should join two sequences of unequal length by dropping the extra elements from the longer sequence when the first sequence is longer"
    (should= [1 5] (my-interleave [1 2 3 4] [5]))))

(run-specs)

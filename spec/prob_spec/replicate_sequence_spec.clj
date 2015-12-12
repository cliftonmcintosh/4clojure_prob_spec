(ns prob-spec.replicate-sequence-spec
  (:require [speclj.core :refer :all]
            [prob-spec.replicate-sequence :refer :all]))

(describe "rep-seq"
  (it "should replicate a sequence of numbers the correct number of times"
    (should= '(1 1 2 2 3 3) (rep-seq [1 2 3] 2)))
  (it "should replicate a sequence of keywords the correct number of times"
    (should= '(:a :a :a :a :b :b :b :b) (rep-seq [:a :b] 4)))
  (it "should replicate a sequence of once when 1 is the number of times specified"
    (should= '(4 5 6) (rep-seq [4 5 6] 1)))
  (it "should replicate a sequence of vectors the correct number of times"
    (should= '([1 2] [1 2] [3 4] [3 4]) (rep-seq [[1 2] [3 4]] 2)))
  (it "should replicate a sequence of numbers greater than 9 the correct number of times"
    (should= [44 44 33 33] (rep-seq [44 33] 2))))

(run-specs)

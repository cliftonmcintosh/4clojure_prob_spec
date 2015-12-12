(ns prob-spec.duplicate-sequence-spec
  (:require [speclj.core :refer :all]
            [prob-spec.duplicate-sequence :refer :all]))

(describe "dup-seq"
  (it "should duplicate numbers in a vector"
    (should= '(1 1 2 2 3 3) (dup-seq [1 2 3])))
  (it "should duplicate keywords in a vector"
    (should= '(:a :a :a :a :b :b :b :b) (dup-seq [:a :a :b :b])))
  (it "should duplicate vectors in a vector"
    (should= '([1 2] [1 2] [3 4] [3 4]) (dup-seq [[1 2] [3 4]]))))

(run-specs)

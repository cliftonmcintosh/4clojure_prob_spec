(ns prob-spec.rotate-sequence-spec
  (:require [speclj.core :refer :all]
            [prob-spec.rotate-sequence :refer :all]))

(describe "rotate-sequence"
  (it "should rotate on a positive pivot that is not greater than the
          length of the collection"
    (should= '(3 4 5 1 2) (rotate-sequence 2 [1 2 3 4 5])))
  (it "should rotate on a negative pivot whose absolute value is not greater than the
          length of the collection"
    (should= '(4 5 1 2 3) (rotate-sequence -2 [1 2 3 4 5])))
  (it "should rotate on a positive pivot whose absolute value is greater than the
          length of the collection"
    (should= '(2 3 4 5 1) (rotate-sequence 6 [1 2 3 4 5])))
  (it "should rotate on a pivot of 1 when the length of the collection is greater than one"
    (should= '(:b :c :a) (rotate-sequence 1 '(:a :b :c))))
  (it "should rotate on a negative pivot whose absolute value is greater than the
          length of the collection is greater than one"
    (should= '(:c :a :b) (rotate-sequence -4 '(:a :b :c)))))

(run-specs)

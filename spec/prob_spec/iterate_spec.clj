(ns prob-spec.iterate-spec
  (:require [speclj.core :refer :all]
            [prob-spec.iterate :refer :all]))

(describe "my-iter"
  (it "should work with '(take 5 (__ #(* 2 %) 1))'"
    (should= [1 2 4 8 16] (take 5 (my-iter #(* 2 %) 1))))
  (it "should work with '(take 100 (__ inc 0))'"
    (should= (take 100 (range)) (take 100 (my-iter inc 0))))
  (it "should work with '(take 9 (__ #(inc (mod % 3)) 1))'"
    (should= (take 9 (cycle [1 2 3])) (take 9 (my-iter #(inc (mod % 3)) 1)))))

(run-specs)

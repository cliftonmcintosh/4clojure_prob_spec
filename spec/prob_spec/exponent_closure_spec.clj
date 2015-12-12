(ns prob-spec.exponent-closure-spec
  (:require [speclj.core :refer :all]
            [prob-spec.exponent-closure :refer [exp-closure]]))

(describe "exp-closure"
  (it "should work with 16 and 2"
    (should= 256 ((exp-closure 2) 16)))
  (it "should work with 8 and 2"
    (should= 256 ((exp-closure 8) 2)))
  (it "should work with several to the power of 3"
    (should= [1 8 27 64] (map (exp-closure 3) [1 2 3 4])))
  (it "should work with several to the power of 2"
    (should= [1 2 4 8 16] (map #((exp-closure %) 2) [0 1 2 3 4]))))

(run-specs)
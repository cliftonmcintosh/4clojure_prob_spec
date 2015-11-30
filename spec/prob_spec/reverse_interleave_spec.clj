(ns prob-spec.reverse-interleave-spec
  (:require [speclj.core :refer :all]
            [prob-spec.reverse-interleave :refer :all]))

(describe "rev-interleave"
          (it "should work with a vector"
              (should= '((1 3 5) (2 4 6)) (rev-interleave [1 2 3 4 5 6] 2)))
          (it "should work with a range"
              (should= '((0 3 6) (1 4 7) (2 5 8)) (rev-interleave (range 9) 3)))
          (it "should work with another range"
              (should= '((0 5) (1 6) (2 7) (3 8) (4 9)) (rev-interleave (range 10) 5))))

(run-specs)

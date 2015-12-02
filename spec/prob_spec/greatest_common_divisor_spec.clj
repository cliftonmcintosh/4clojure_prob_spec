(ns prob-spec.greatest-common-divisor-spec
  (:require [speclj.core :refer :all]
            [prob-spec.greatest-common-divisor :refer :all]))

(describe "divisor"
          (it "should work with 2 and 4"
              (should= 2 (divisor 2 4)))
          (it "should work with 10 and 5"
              (should= 5 (divisor 10 5)))
          (it "should work with 5 and 7"
              (should= 1 (divisor 5 7)))
          (it "should work with 1023 and 858"
              (should= 33 (divisor 1023 858))))

(run-specs)

(ns prob-spec.factorial-spec
  (:require [speclj.core :refer :all]
            [prob-spec.factorial :refer :all]))

(describe "factorial"
          (it "should yield 1 for 1"
              (should= 1 (factorial 1)))
          (it "should yield 6 for 3"
              (should= 6 (factorial 3)))
          (it "should yield 120 for 5"
              (should= 120 (factorial 5)))
          (it "should yield 40320 for 8"
              (should= 40320 (factorial 8))))

(run-specs)

(ns prob-spec.flatten-spec
  (:require [speclj.core :refer :all]
            [prob-spec.flatten :refer :all]))

(describe "flatten a sequence"
          (it "should flatten a list with lists and vectors"
              (should= '(1 2 3 4 5 6) (my-flatten '((1 2) 3 [4 [5 6]])))))

(run-specs)

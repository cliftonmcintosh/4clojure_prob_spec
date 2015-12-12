(ns prob-spec.flatten-spec
  (:require [speclj.core :refer :all]
            [prob-spec.flatten :refer :all]))

(describe "flatten a sequence"
  (it "should flatten a list with lists and vectors"
    (should= '(1 2 3 4 5 6) (my-flatten '((1 2) 3 [4 [5 6]]))))
  (it "should flatten a vector with a vector in it"
    (should= '("a" "b" "c") (my-flatten ["a" ["b"] "c"])))
  (it "should flatten a deeply nested element"
    (should= '(:a) (my-flatten '((((:a))))))))

(run-specs)

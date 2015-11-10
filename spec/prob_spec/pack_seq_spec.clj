(ns prob-spec.pack-seq-spec
  (:require [speclj.core :refer :all]
            [prob-spec.pack-seq :refer :all]))

(describe "pack"
          (it "should pack consecutive duplicate numbers into sub-lists"
              (should= '((1 1) (2) (1 1 1) (3 3)) (pack [1 1 2 1 1 1 3 3])))
          (it "should pack consecutive duplicate keywords into sub-lists"
              (should= '((:a :a) (:b :b) (:c)) (pack [:a :a :b :b :c])))
          (it "should pack consecutive duplicate sequences into sub-lists"
              (should= '(([1 2] [1 2]) ([3 4])) (pack [[1 2] [1 2] [3 4]]))))

(run-specs)

(ns prob-spec.drop-nth-spec
  (:require [speclj.core :refer :all]
            [prob-spec.drop-nth :refer :all]))

(describe "drop-nth"
          (it "should work with numbers"
              (should= [1 2 4 5 7 8] (drop-every-nth [1 2 3 4 5 6 7 8] 3)))
          (it "should work with keywords"
              (should= [:a :c :e] (drop-every-nth [:a :b :c :d :e :f] 2)))
          (it "should work with more numbers"
              (should= [1 2 3 5 6] (drop-every-nth [1 2 3 4 5 6] 4))))

(run-specs)

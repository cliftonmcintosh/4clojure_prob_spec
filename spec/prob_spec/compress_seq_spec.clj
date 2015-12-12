(ns prob-spec.compress-seq-spec
  (:require [speclj.core :refer :all]
            [prob-spec.compress-seq :refer :all]))

(describe "compress"
  (it "should remove consecutive duplicates from a string"
    (should= "Leroy" (apply str (compress "Leeeeeerrroyyy"))))
  (it "should remove consecutive duplicates from a vector"
    (should= '(1 2 3 2 3) (compress [1 1 2 3 3 2 2 3])))
  (it "should recognize matching embedded sequences as duplicates"
    (should= '([1 2] [3 4] [1 2]) (compress [[1 2] [1 2] [3 4] [1 2]]))))

(run-specs)

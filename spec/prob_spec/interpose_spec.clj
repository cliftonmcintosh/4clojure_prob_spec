(ns prob-spec.interpose-spec
  (:require [speclj.core :refer :all]
            [prob-spec.interpose :refer :all]))

(describe "my-interpose"
  (it "should interpose numbers"
    (should= [1 0 2 0 3] (my-interpose 0 [1 2 3])))
  (it "should interpose strings"
    (should= "one, two, three" (apply str (my-interpose ", " ["one" "two" "three"]))))
  (it "should interpose keywords"
    (should= [:a :z :b :z :c :z :d] (my-interpose :z [:a :b :c :d]))))

(run-specs)

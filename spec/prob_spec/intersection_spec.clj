(ns prob-spec.intersection-spec
  (:require [speclj.core :refer :all]
            [prob-spec.intersection :refer :all]))

(describe "my-intersection"
  (it "should find the intersection in sets of numbers"
    (should= #{2 3} (my-intersection #{0 1 2 3} #{2 3 4 5})))
  (it "should return an empty set if there is no intersection"
    (should= #{} (my-intersection #{0 1 2} #{3 4 5})))
  (it "should find the intersection in sets of keywords"
    (should= #{:a :c :d} (my-intersection #{:a :b :c :d} #{:c :e :a :f :d}))))

(run-specs)

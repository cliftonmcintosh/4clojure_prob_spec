(ns prob-spec.construct-map-spec
  (:require [speclj.core :refer :all]
            [prob-spec.construct-map :refer :all]))

(describe "construct-map"
          (it "should map equal numbers of items"
              (should= {:a 1 :b 2 :c 3} (construct-map [:a :b :c] [1 2 3])))
          (it "should map only up to the last item in the second seq when the first seq is longer"
              (should= {1 "one" 2 "two" 3 "three"} (construct-map [1 2 3 4] ["one" "two" "three"])))
          (it "should map only up to the last item in the first seq when the second seq is longer"
              (should= {:foo "foo", :bar "bar"} (construct-map [:foo :bar] ["foo" "bar" "baz"]))))

(run-specs)

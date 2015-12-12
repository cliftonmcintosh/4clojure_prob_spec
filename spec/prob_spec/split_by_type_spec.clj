(ns prob-spec.split-by-type-spec
  (:require [speclj.core :refer :all]
            [prob-spec.split-by-type :refer [split-by-type]]))

(describe "split-by-type"
  (it "should split simple vector entries"
    (should= #{[1 2 3] [:a :b :c]} (set (split-by-type [1 :a 2 :b 3 :c]))))
  (it "should split simple keyword and string entries"
    (should= #{[:a :b] ["foo" "bar"]} (set (split-by-type [:a "foo" "bar" :b]))))
  (it "should split lists as itmes"
    (should= #{[[1 2] [3 4]] [:a :b] [5 6]} (set (split-by-type [[1 2] :a [3 4] 5 6 :b])))))

(run-specs)

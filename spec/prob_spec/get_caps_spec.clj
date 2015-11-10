(ns prob-spec.get-caps-spec
  (:require [speclj.core :refer :all]
            [prob-spec.get-caps :refer :all]))

(describe "get capitals from a string"
          (it "should get all the capitals from a string"
              (should= "HLOWRD" (get-caps "HeLlO, WoRlD!")))
          (it "should get nothing if there are no capitals in the inpu"
              (should-be empty? (get-caps "nothing")))
          (it "should get the capitas when there are special characters"
              (should= "AZ" (get-caps "$#A(*&987Zf"))))

(run-specs)

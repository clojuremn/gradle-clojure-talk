(ns example.core-test2
  (:require [clojure.test :refer :all]
            [example.core :refer :all]))

(deftest math
  (testing "the world is OK"
    (is (= 4 (+ 2 2)))))

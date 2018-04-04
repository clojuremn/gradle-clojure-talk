(ns example.core-test
  (:require [clojure.test :refer :all]
            [example.core :refer :all]
            [clojure.string :as string]))

(deftest greeting
  (testing "Greeting ends with !"
    (is (string/ends-with? (greetings "Bob") "!")))
  (testing "Greeting starts with \"Greetings\""
    (is (string/starts-with? (greetings "Bob") "Greetings"))))

(deftest palindrome
  (testing "is racecar a palindrome"
    (is (= "racecar" (string/reverse "racecar")))
    (is (= "not-a-palindrome" (string/reverse "not-a-palindrome")))))

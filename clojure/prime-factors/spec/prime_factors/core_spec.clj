(ns prime-factors.core-spec
  (:require [speclj.core :refer :all]
            [prime-factors.core :refer :all]))

(describe "factors-for"
  (for [[n factors]
    [
      [1 []]
      [2 [2]]
      [3 [3]]
      [4 [2 2]]
      [5 [5]]
      [6 [2 3]]
      [7 [7]]
      [8 [2 2 2]]
      [9 [3 3]]
    ]]
  (it (str "factors " n)
    (should= factors (factors-for n)))))

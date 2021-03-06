(ns dsclj.core-test
  (:require [clojure.test :refer :all]
            [dsclj.core :refer :all]
            [dsclj.trees.BinarySearchTree :as bst]))

(deftest BinarySearchTree
  (testing "BinarySearchTree integers"
  	(let [t (reduce bst/insert nil [5 2 7 6 1 9 8])]
    	
    	(is (bst/contains t 2))
    	
    	(is (not (bst/contains t 4)))
    	
    	(is (= 1 (bst/find-min t)))
    	
    	(is (= 9 (bst/find-max t)))
    	
    	(is (= 2 (bst/find-min (bst/remove t 1))))
    	
    	(is (= '(1 2 5 6 7 8 9) (bst/seq t)))

    	(is (nil? (bst/find t 3)))

    	(is (= '(6 7 8 9) (bst/seq (bst/find t 7)))))))

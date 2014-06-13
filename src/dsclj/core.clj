(ns dsclj.core 
	(:require [dsclj.trees.BinarySearchTree :as bst]))

(defn -main []
	(println "Main function here!")
	(println (reduce bst/insert [5 2 3 9 0 1])))





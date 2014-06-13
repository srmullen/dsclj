(ns dsclj.trees.BinarySearchTree)

(defrecord BinaryNode [val l r])

(defn- conj [t val]
	(if (nil? t)
		(BinaryNode. val nil nil)
		(let [lor (compare val (:val t))]
			(cond
				(neg? lor)  (BinaryNode. (:val t) (conj (:l t) val) (:r t))
				(zero? lor) t
				(pos? lor)  (BinaryNode. (:val t) (:l t) (conj (:r t) val))))))

(defn insert 
	"Returns the result of adding a value to a tree"
	([val]
		(conj nil val))
	([t val]
		(conj t val)))

(defn contains [t val]
	"Returns true if the value is in the tree, otherwise returns false"
	(if (nil? (:val t))
		false
		(let [lor (compare val (:val t))]
			(cond
				(neg? lor)  (recur (:l t) val)
				(zero? lor) true
				(pos? lor)  (recur (:r t) val)))))

(defn remove [t val]
	"Returns the result of removing the given value from the tree"
	)

(defn find-min [t]
	(if (:l t)
		(recur (:l t))
		(:val t)))

(defn find-max [t]
	(if (:r t)
		(recur (:r t))
		(:val t)))
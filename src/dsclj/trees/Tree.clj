(ns dsclj.trees.Tree)

(defprotocol TREE
	(insert [t val])
	(contains [t val])
	(update [t val])
	(delete [t val]))
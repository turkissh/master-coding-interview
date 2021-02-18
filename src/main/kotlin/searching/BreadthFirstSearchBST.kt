package searching

import tree.BinarySearchTree
import tree.Node

class BreadthFirstSearchBST: BinarySearchTree() {

	fun breadthFirstSearch(value: Int): List<Int> {
		val rootNode = root
		val nodeTraversed = mutableListOf<Int>()
		val queueToSearch = mutableListOf<Node>()

		if(rootNode == null) return emptyList()
		queueToSearch.add(rootNode)

		while(queueToSearch.isNotEmpty()) {
			val nodeToCheck = queueToSearch.removeAt(0)
			nodeTraversed.add(nodeToCheck.value)

			if(nodeToCheck.value == value) {
				return nodeTraversed
			} else {
				nodeToCheck.leftChild?.let { queueToSearch.add(it) }
				nodeToCheck.rightChild?.let { queueToSearch.add(it) }
			}
		}

		return nodeTraversed
	}

}
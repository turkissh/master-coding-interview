package tree

class BinarySearchTree {
	private var root: Node? = null

	fun insert(value: Int) {
		if (root == null) {
			root = Node(value)
		} else {
			searchForHeadingNode(value)?.let {
				if (it.value > value) {
					it.leftChild = Node(value)
				} else {
					it.rightChild = Node(value)
				}
			}
		}
	}

	fun lookup(value: Int): Node? {
		if (root?.value == value) {
			return root
		}
		searchForHeadingNode(value)?.let {
			return when {
				it.value == value -> it
				it.value > value -> it.rightChild
				it.value < value -> it.leftChild
				else -> null
			}
		}

		return null
	}

	private fun searchForHeadingNode(value: Int): Node? {
		var headerNode: Node? = null
		var pointerNode = root
		while (headerNode == null) {
			if (pointerNode!!.value == value) return pointerNode

			if (pointerNode.value > value) {
				if (pointerNode.leftChild == null) {
					headerNode = pointerNode
				} else {
					pointerNode = pointerNode.leftChild
				}
			} else {
				if (pointerNode.rightChild == null) {
					headerNode = pointerNode
				} else {
					pointerNode = pointerNode.rightChild
				}
			}
		}
		return headerNode
	}

	fun traverse(): List<Int> {
		val values = mutableListOf<Int>()
		root?.addChildNodes(values)
		return values
	}

	private fun Node.addChildNodes(values: MutableList<Int>) {
		leftChild?.addChildNodes(values)
		values.add(value)
		rightChild?.addChildNodes(values)
	}
}

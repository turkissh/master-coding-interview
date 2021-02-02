package tree

class BinarySearchTree {
	private var root: Node? = null

	fun insert(value: Int) {
		if (root == null) {
			root = Node(value)
		} else {
			searchNodeForInsert(value)?.let {
				if (it.value > value) {
					it.leftChild = Node(value)
				} else {
					it.rightChild = Node(value)
				}
			}
		}
	}

	fun lookup(value: Int): Node? {
		if (root?.value == value || root == null) {
			return root
		}
		var parentFromValue: Node? = null
		var heading = root
		while (parentFromValue == null) {
			if (heading!!.leftValue() == value || heading!!.rightValue() == value) {
				parentFromValue = heading
			} else {
				heading = if (heading.value > value) {
					if (heading.leftChild == null) return null
					heading.leftChild
				} else {
					if (heading.rightChild == null) return null
					heading.rightChild
				}
			}
		}

		parentFromValue.let {
			return when {
				it.value == value -> it
				it.value < value -> it.rightChild
				it.value > value -> it.leftChild
				else -> null
			}
		}
	}

	fun remove(value: Int) {
		if (root?.value == value || root == null) {
			root = null
		} else {
			var parentFromValue: Node? = null
			var heading = root
			while (parentFromValue == null) {
				if (heading!!.leftValue() == value || heading!!.rightValue() == value) {
					parentFromValue = heading
				} else {
					heading = if (heading.value > value) {
						heading.leftChild
					} else {
						heading.rightChild
					}
				}
			}

			val valueToRemove = if (parentFromValue.leftValue() == value) {
				parentFromValue.leftChild!!
			} else {
				parentFromValue.rightChild!!
			}

			var valueToReplace: Node
			if(valueToRemove.rightChild != null) {
				//
			} else if ( valueToRemove.leftChild != null) {
				//
			} else {

			}
		}
	}

	private fun searchNodeForInsert(value: Int): Node? {
		var headerNode: Node? = null
		var pointerNode = root
		while (headerNode == null && pointerNode != null) {
			if (pointerNode?.value == value) return pointerNode

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

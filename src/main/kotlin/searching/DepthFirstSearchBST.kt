package searching

import tree.BinarySearchTree
import tree.Node

class DepthFirstSearchBST : BinarySearchTree() {

	fun dfsInOrder(value: Int): List<Int> {
		return traverInOrder(root!!, mutableListOf(), value, false)
	}

	private fun traverInOrder(node: Node, list: MutableList<Int>, value: Int, fount: Boolean): MutableList<Int> {
		node.leftChild?.let { traverInOrder(it, list, value, fount) }
		list.add(node.value)
		var fount = fount
		if(node.value == value) { fount = true }
		if(fount) return list
		node.rightChild?.let { traverInOrder(it, list, value, fount) }

		return list
	}

	fun dfsPreOrder(value: Int): List<Int> {
		return traverPreOrder(root!!, mutableListOf(), value, false)
	}

	private fun traverPreOrder(node: Node, list: MutableList<Int>, value: Int, fount: Boolean): MutableList<Int> {
		list.add(node.value)
		var fount = fount
		if(node.value == value) { fount = true }
		if(fount) return list
		node.leftChild?.let { traverPreOrder(it, list, value, fount) }
		node.rightChild?.let { traverPreOrder(it, list, value, fount) }

		return list
	}

	fun dfsPostOrder(value: Int): List<Int> {
		return traverPostOrder(root!!, mutableListOf(), value, false)
	}

	private fun traverPostOrder(node: Node, list: MutableList<Int>, value: Int, fount: Boolean): MutableList<Int> {
		var fount = fount
		if(node.value == value) { fount = true }
		node.leftChild?.let { traverPostOrder(it, list, value, fount) }
		node.rightChild?.let { traverPostOrder(it, list, value, fount) }
		list.add(node.value)
		if(fount) return list

		return list
	}
}
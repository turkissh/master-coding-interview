package tree

class Node(val value: Int) {
	var leftChild: Node? = null
	var rightChild: Node? = null

	fun leftValue(): Int? = leftChild?.value
	fun rightValue(): Int? = rightChild?.value
}
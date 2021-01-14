package stacksAndQueues

class Node(val value: Any, var next: Node? = null) {
	fun setNextNode(node: Node?) {
		this.next = node
	}
}
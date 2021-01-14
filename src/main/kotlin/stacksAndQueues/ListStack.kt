package stacksAndQueues

class ListStack : Stack {
	var top: Node? = null
	var bottom: Node? = null
	var length = 0

	override fun peek(): Any? {
		return top?.value
	}

	override fun push(value: Any) {
		val node = Node(value)
		if (length == 0) {
			bottom = node
			top = node
		} else {
			node.setNextNode(top)
			top = node
		}
		incrementLength()
	}

	override fun pop(): Any? {
		if (isEmpty()) return null

		if (isLastValue()) {
			bottom = null
		}
		val value = top
		top = top?.next
		decrementLength()
		return value?.value
	}

	override fun isEmpty() = length == 0

	private fun isLastValue() = length == 1

	private fun incrementLength() {
		length++
	}

	private fun decrementLength() {
		length--
	}
}

class Node(val value: Any, var next: Node? = null) {
	fun setNextNode(node: Node?) {
		this.next = node
	}
}
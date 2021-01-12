package stacksAndQueues

class Stack {
	var top: Node? = null
	var bottom: Node? = null
	var length = 0

	fun peek(): Any? {
		return top?.value
	}

	fun push(value: Any) {
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

	fun pop(): Any? {
		if (isEmpty()) return null

		if (isLastValue()) {
			bottom = null
		}
		val value = top
		top = top?.next
		decrementLength()
		return value?.value
	}

	private fun isLastValue() = length == 1

	fun isEmpty() = length == 0

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
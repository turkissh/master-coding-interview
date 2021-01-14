package stacksAndQueues.queue

import stacksAndQueues.Node

class ListQueue : Queue {

	var length = 0
	var first: Node? = null
	var last: Node? = null

	override fun peek(): Any? {
		return first?.value
	}

	override fun enqueue(value: Any) {
		val node = Node(value)

		if (last == null) {
			first = node
			last = node
		} else {
			last?.setNextNode(node)
			last = node
		}

		incrementLength()
	}

	override fun dequeue(): Any? {
		if (first == null) return null

		val value = first!!.value
		if (first?.next == null) {
			first = null
			last = null
		} else {
			first = first!!.next
		}
		decrementLength()
		return value
	}

	override fun isEmpty() = length == 0

	private fun incrementLength() {
		length++
	}

	private fun decrementLength() {
		length--
	}
}

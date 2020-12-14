package linkedLists

class CustomLinkedList(value: Any) {
	private var head: Node
	private var tail: Node
	private var length: Int

	init {
		this.head = Node(value, null)
		this.tail = head
		length = 1
	}

	fun append(newValue: Any) {
		val newNode = Node(newValue, null)
		appendValue(newNode)
		incrementLength()
	}

	fun prepend(newValue: Any) {
		val newHead = Node(newValue, this.head)
		this.head = newHead
		incrementLength()
	}

	fun insert(index: Int, value: Any) {
		var leaderNode = getLeaderNode(index)

		val newNode = Node(value, leaderNode.next)
		leaderNode.setNextNode(newNode)
		incrementLength()
	}

	private fun getLeaderNode(index: Int): Node {
		var currentIndex = 0
		var current = this.head
		while (current.next != null && currentIndex + 1 < index) {
			current = current.next!!
			currentIndex++
		}
		return current
	}

	fun remove(index: Int) {
		val leaderNode = getLeaderNode(index)
		val valueToRemove = leaderNode.next ?: return

		leaderNode.setNextNode(valueToRemove.next)

		decrementLength()
	}

	fun returnAll(): List<Any> {
		val list = mutableListOf<Any>()
		var node: Node? = this.head
		while (node != null) {
			list.add(node.value)
			node = node.next
		}

		return list
	}

	private fun appendValue(newNode: Node) {
		this.tail.setNextNode(newNode)
		this.tail = newNode
	}

	fun length() = length

	private fun incrementLength() {
		length++
	}

	private fun decrementLength() {
		length--
	}
}

class Node(val value: Any, var next: Node?) {
	fun setNextNode(node: Node?) {
		this.next = node
	}
}
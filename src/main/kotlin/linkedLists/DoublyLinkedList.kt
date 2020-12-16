package linkedLists

class DoublyLinkedList(value: Any) {
	private var head: DoublyLinkedNode
	private var tail: DoublyLinkedNode
	private var length: Int

	init {
		this.head = DoublyLinkedNode(value, null, null)
		this.tail = head
		length = 1
	}

	fun append(newValue: Any) {
		val newNode = DoublyLinkedNode(newValue, null, null)
		appendValue(newNode)
		incrementLength()
	}

	fun prepend(newValue: Any) {
		val newHead = DoublyLinkedNode(newValue, null, this.head)
		this.head.setLastNode(newHead)
		this.head = newHead
		incrementLength()
	}

	fun insert(index: Int, value: Any) {
		if (index == 0) {
			prepend(value)
		} else {
			val leaderNode = getLeaderNode(index)
			val newNode = DoublyLinkedNode(value, leaderNode, leaderNode.next)
			leaderNode.next?.setLastNode(newNode)
			leaderNode.setNextNode(newNode)
			incrementLength()
		}
	}

	private fun getLeaderNode(index: Int): DoublyLinkedNode {
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
		var node: DoublyLinkedNode? = this.head
		while (node != null) {
			list.add(node.value)
			node = node.next
		}

		return list
	}

	private fun appendValue(newNode: DoublyLinkedNode) {
		this.tail.setNextNode(newNode)
		newNode.setLastNode(tail)
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

class DoublyLinkedNode(val value: Any, var last: DoublyLinkedNode?, var next: DoublyLinkedNode?) {
	fun setLastNode(node: DoublyLinkedNode?) {
		this.last = node
	}

	fun setNextNode(node: DoublyLinkedNode?) {
		this.next = node
	}
}
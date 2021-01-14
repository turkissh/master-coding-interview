package stacksAndQueues.stack

import kotlin.math.max

class ArrayStack : Stack {
	private val values = arrayListOf<Any>()
	val length: Int
		get() = values.size

	override fun peek(): Any? {
		return values[last()]
	}

	override fun push(value: Any) {
		values.add(value)
	}

	override fun pop(): Any? {
		return values.removeLastOrNull()
	}

	override fun isEmpty(): Boolean = values.isEmpty()

	private fun last() = max(values.size - 1, 0)
}
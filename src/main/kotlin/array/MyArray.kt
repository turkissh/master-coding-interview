package array

class MyArray<T>() {

	private var length: Int = 0
	private var data: Map<Int, T> = mapOf()

	fun get(index: Int): T? = data[index]

	fun length() = length

	fun push(item: T) {
		data = data.toPair()
				.plus(length to item)
				.toMap()
		incrementLength()
	}

	fun pop(): T {
		val pairs = data.toPair()
		val value = pairs.last()
		data = pairs.dropLast(1).toMap()
		decrementLength()
		return value.second
	}

	fun delete(index: Int) {
		check(index < length)

		val pairs = data.toPair()
		val newValues = removeAndReArrangeValues(pairs, index)

		data = newValues.toMap()
		decrementLength()
	}

	private fun removeAndReArrangeValues(pairs: List<Pair<Int, T>>, index: Int): List<Pair<Int, T>> {
		return pairs.mapIndexed { i, value ->
			when {
				index > i -> value
				index == i -> null
				index < i -> Pair(value.first - 1, value.second)
				else -> null
			}
		}.filterNotNull()
	}

	private fun Map<Int, T>.toPair(): List<Pair<Int, T>> = this.map { entry -> entry.key to entry.value }

	private fun incrementLength() {
		length++
	}

	private fun decrementLength() {
		this.length--
	}
}

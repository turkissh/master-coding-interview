package hastTables

import kotlin.math.absoluteValue

class CustomHashTable<K, V> {

	private val keys = mutableListOf<Int>()
	private val buckets = mutableListOf<MutableList<CustomMap<K, V>>>()

	fun set(key: K, value: V) {
		val index = getHashIndex(key)
		saveKey(index)
		saveValue(index, key, value)
	}

	fun get(key: K): V? {
		val index = getHashIndex(key)
		val bucketIndex = keys.indexOf(index)
		return buckets.getOrNull(bucketIndex)?.first { it.key == key }?.value
		//Most probably it will always gonna be O(1), except with collision that can be O(n)
	}

	private fun saveKey(index: Int) {
		keys.add(index)
	}

	private fun saveValue(index: Int, key: K, value: V) {
		val bucketIndex = keys.indexOf(index)
		val newValue = CustomMap(key, value)
		if (buckets.getOrNull(bucketIndex) == null) {
			buckets.add(mutableListOf())
		}
		buckets[bucketIndex].add(newValue)
	}

	private fun getHashIndex(key: K): Int {
		return key.hashCode().absoluteValue % MAX_SIZE
	}

	private companion object {
		const val MAX_SIZE = 5000
	}
}

data class CustomMap<K, V>(val key: K, val value: V)
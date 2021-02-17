package sorting

class InsertionSort {
	fun sort(values: ArrayList<Int>): ArrayList<Int> {

		for (index in 1 until values.size) {
			if (values[index] < values[index - 1]) {
				for (sortingIndex in 0 until index) {
					if (values[index] < values[sortingIndex]) {
						val sortingValue = values[index]
						makeSpaceForValue(values, sortingIndex, index)
						values[sortingIndex] = sortingValue
					}
				}
			}
		}

		return values
	}

	private fun makeSpaceForValue(values: ArrayList<Int>, from: Int, to: Int) {
		for (index in to downTo from) {
			if (index > 0) {
				values[index] = values[index - 1]
			}
		}
	}
}
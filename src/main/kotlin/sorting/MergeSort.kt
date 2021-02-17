package sorting

class MergeSort {
	fun sort(values: ArrayList<Int>): ArrayList<Int> {
		if (values.size == 1) {
			return values
		}

		val left = arrayListOf<Int>().apply { addAll(values.subList(0, values.size / 2)) }
		val right = arrayListOf<Int>().apply { addAll(values.subList(values.size / 2, values.size)) }

		return merge(
			sort(left),
			sort(right)
		)
	}

	private fun merge(left: ArrayList<Int>, right: ArrayList<Int>): ArrayList<Int> {
		val mergedArray = arrayListOf<Int>()
		var leftIndex = 0
		var rightIndex = 0

		while(leftIndex < left.size && rightIndex < right.size) {
			if(left[leftIndex] < right[rightIndex]) {
				mergedArray.add(left[leftIndex])
				leftIndex++
			} else {
				mergedArray.add(right[rightIndex])
				rightIndex++
			}
		}

		if(leftIndex >= left.size) {
			mergedArray.addAll(right.subList(rightIndex, right.size))
		} else {
			mergedArray.addAll(left.subList(leftIndex, left.size))
		}

		return mergedArray
	}
}
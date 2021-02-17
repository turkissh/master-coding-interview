package sorting

class SelectionSort {
	fun sort(values: ArrayList<Int>): ArrayList<Int> {
		for(position in 0 until values.size) {
			var lowerIndex = position
			for(comparingIndex in position + 1 until values.size) {
				if(values[comparingIndex] < values[lowerIndex]) {
					lowerIndex = comparingIndex
				}
			}

			if(values[lowerIndex] < values[position]) {
				val supportingValue = values[position]
				values[position] = values[lowerIndex]
				values[lowerIndex] = supportingValue
			}
		}
		return values
	}
}
package sorting

class BubbleSort {
	fun sort(values: ArrayList<Int>): ArrayList<Int> { //O(n^2)  -  SC: O(1)
		var sorted = false
		while(!sorted) {
			sorted = true
			for(index in 1 until values.size) {
				val headValue = values[index]
				val baseValue = values[index - 1]

				if(baseValue > headValue) {
					values[index - 1] = headValue
					values[index] = baseValue
					sorted = false
				}

			}
		}
		return values
	}
}
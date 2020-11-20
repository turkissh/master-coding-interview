package array

class MergeSortedArrays {

	//Given two arrays, merge them sorted ascending
	//Both arrays are already sorted
	// [0,3,4,31] [4,6,30] -> [0,3,4,4,6,30,31]
	operator fun invoke(array1: ArrayList<Int>, array2: ArrayList<Int>) : ArrayList<Int> {

		/*array1.addAll(array2)
		array1.sort()
		return array1*/

		val arraySorted = arrayListOf<Int>()

		while(arraysAreNotEmpty(array1, array2)) {
			when {
				array1.isEmpty() -> addFromArray(arraySorted, array2)
				array2.isEmpty() -> addFromArray(arraySorted, array1)
				array1[0] < array2[0] -> addFromArray(arraySorted, array1)
				array1[0] > array2[0]  -> addFromArray(arraySorted, array2)
				else -> addFromArray(arraySorted, array2)
			}
		}

		return arraySorted
	}

	private fun arraysAreNotEmpty(array1: ArrayList<Int>, array2: ArrayList<Int>) =
			array1.isNotEmpty() || array2.isNotEmpty()

	private fun addFromArray(arraySorted: ArrayList<Int>, array2: ArrayList<Int>) {
		arraySorted.add(array2.removeAt(0))
	}
}
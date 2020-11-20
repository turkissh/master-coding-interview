package array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MergeSortedArraysTest {

	private lateinit var array1: ArrayList<Int>
	private lateinit var array2: ArrayList<Int>
	private lateinit var result: ArrayList<Int>

	@Test
	internal fun `merge and sort arrays`() {
		givenTwoArrays()

		whenMergeAndSort()

		thenArrayShouldBeSorted()
	}

	@Test
	internal fun `one array is empty`() {
		givenOneArrayEmpty()

		whenMergeAndSort()

		thenTheNonEmptyArrayIsReturned()
	}

	private fun givenTwoArrays() {
		array1 = arrayListOf(0, 3, 4, 31)
		array2 = arrayListOf(4, 6, 30)
	}

	private fun givenOneArrayEmpty() {
		array1 = arrayListOf(0, 3, 4, 31)
		array2 = arrayListOf()
	}

	private fun whenMergeAndSort() {
		val action = MergeSortedArrays()
		result = action(array1, array2)
	}

	private fun thenArrayShouldBeSorted() {
		val allSortedValues = arrayListOf(0,3,4,4,6,30,31)
		assertThat(result).isEqualTo(allSortedValues)
	}

	private fun thenTheNonEmptyArrayIsReturned() {
		assertThat(result).isEqualTo(arrayListOf(0, 3, 4, 31))
	}
}

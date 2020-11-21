package array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TwoSumTest {

	private lateinit var listOfValues: List<Int>
	private lateinit var complementsIndexes: IntArray

	@Test
	internal fun `get complements indexes`() {
		givenAnArray(listOf(2,7,11,15))

		whenFindComplementsOfTarget(9)

		thenComplementsIndexesAreReturned(listOf(0,1))
	}

	@Test
	internal fun `get complements indexes 2`() {
		givenAnArray(listOf(3,2,4))

		whenFindComplementsOfTarget(6)

		thenComplementsIndexesAreReturned(listOf(1,2))
	}

	@Test
	internal fun `get complements indexes 3`() {
		givenAnArray(listOf(3,3))

		whenFindComplementsOfTarget(6)

		thenComplementsIndexesAreReturned(listOf(0,1))
	}

	private fun givenAnArray(listOfNumbers: List<Int>) {
		listOfValues = listOfNumbers
	}

	private fun whenFindComplementsOfTarget(target: Int) {
		val action = TwoSum()
		complementsIndexes = action(listOfValues, target)
	}

	private fun thenComplementsIndexesAreReturned(expectedIndexes: List<Int>) {
		assertThat(complementsIndexes.toList()).containsAll(expectedIndexes)
	}

}
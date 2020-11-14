package solvingproblems

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class TwoArraysCoincideceTest {

	private lateinit var array1: Array<Char>
	private lateinit var array2: Array<Char>
	private var hasCoincidence: Boolean = false

	@Test
	internal fun `different arrays should return false`() {
		givenTwoDifferentArrays()

		whenCheckCoincidences()

		thenThereArentCoincidences()
	}

	@Test
	internal fun `arrays with coincidence should return true`() {
		givenTwoArraysWithCoincidence()

		whenCheckCoincidences()

		thenThereAreCoincidences()
	}

	@Test
	internal fun `empty arrays`() {
		givenTwoEmptyArrays()

		whenCheckCoincidences()

		thenThereArentCoincidences()
	}

	private fun givenTwoDifferentArrays() {
		array1 = arrayOf('a','b','c')
		array2 = arrayOf('x','y','z')
	}

	private fun givenTwoArraysWithCoincidence() {
		array1 = arrayOf('a','b','c')
		array2 = arrayOf('x','y','z','a')
	}

	private fun givenTwoEmptyArrays() {
		array1 = emptyArray()
		array2 = emptyArray()
	}

	private fun whenCheckCoincidences() {
		hasCoincidence = TwoArraysCoincidece().invoke(array1,array2)
	}

	private fun thenThereArentCoincidences() {
		assertFalse(hasCoincidence)
	}

	private fun thenThereAreCoincidences() {
		assertTrue(hasCoincidence)
	}
}

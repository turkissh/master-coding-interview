package array

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class MyArrayTest {

	private lateinit var array: MyArray<Int>
	private var value: Int = 0

	@Test
	internal fun `save a value`() {
		givenAnArray()

		whenSaveAValue()

		thenValueIsSaved()
	}

	@Test
	internal fun `save two values`() {
		givenAnArray()
		givenASavedValue()

		whenSaveAnotherValue()

		thenBothValuesAreSaved()
	}

	@Test
	internal fun `empty array`() {
		givenAnArray()

		thenTheArrayIsEmpty()
	}

	@Test
	internal fun `pop a value`() {
		givenAnArray()
		givenTwoSavedValues()

		whenPop()

		thenLastValueIsPopped()
	}

	@Test
	internal fun `delete at a index`() {
		givenAnArray()
		givenTwoSavedValues()

		whenDelete()

		thenValueIsDeleted()
	}

	@Test
	internal fun `delete not existing value`() {
		givenAnArray()
		givenASavedValue()

		assertThrows<IllegalStateException> { whenDelete(SECOND_INDEX) }

		thenNonValueIsDeleted()
	}

	private fun givenAnArray() {
		array = MyArray()
	}

	private fun givenASavedValue() {
		array.push(VALUE_ONE)
	}

	private fun givenTwoSavedValues() {
		array.push(VALUE_ONE)
		array.push(ANOTHER_VALUE)
	}

	private fun whenSaveAValue() {
		array.push(VALUE_ONE)
	}

	private fun whenSaveAnotherValue() {
		array.push(ANOTHER_VALUE)
	}

	private fun whenPop() {
		value = array.pop()
	}

	private fun whenDelete(index: Int = FIRST_INDEX) {
		array.delete(index)
	}

	private fun thenValueIsSaved() {
		assertEquals(VALUE_ONE, array.get(FIRST_INDEX))
		assertEquals(1, array.length())
	}

	private fun thenBothValuesAreSaved() {
		assertEquals(VALUE_ONE, array.get(FIRST_INDEX))
		assertEquals(ANOTHER_VALUE, array.get(SECOND_INDEX))
		assertEquals(2, array.length())
	}

	private fun thenTheArrayIsEmpty() {
		assertEquals(null, array.get(FIRST_INDEX))
		assertEquals(0, array.length())
	}

	private fun thenLastValueIsPopped() {
		assertEquals(ANOTHER_VALUE, value)
		assertEquals(1, array.length())
	}

	private fun thenValueIsDeleted() {
		assertEquals(ANOTHER_VALUE, array.get(0))
		assertEquals(1, array.length())
	}

	private fun thenNonValueIsDeleted() {
		assertEquals(VALUE_ONE, array.get(0))
		assertEquals(1, array.length())
	}

	private companion object {
		const val VALUE_ONE = 100
		const val ANOTHER_VALUE = 100
		const val FIRST_INDEX = 0
		const val SECOND_INDEX = 1
	}
}

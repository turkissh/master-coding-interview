package array

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseStringTest {

	private lateinit var textToReverse: String
	private lateinit var reversedText: String

	@Test
	internal fun `reverse a text`() {
		givenAText()

		whenReverse()

		thenTextIsReversed()
	}

	@Test
	internal fun `reverse empty texts returns empty text`() {
		givenAnEmptyText()

		whenReverse()

		thenTheReversedTextIsEmpty()
	}

	private fun givenAText() {
		textToReverse = TEXT
	}

	private fun givenAnEmptyText() {
		textToReverse = EMPTY_TEXT
	}

	private fun whenReverse() {
		val reverseString = ReverseString()
		reversedText = reverseString(textToReverse)
	}

	private fun thenTextIsReversed() {
		assertEquals(REVERSED_TEXT, reversedText)
	}

	private fun thenTheReversedTextIsEmpty() {
		assertEquals(EMPTY_TEXT, reversedText)
	}

	private companion object {
		const val TEXT = "Hi my name is Andrei"
		const val REVERSED_TEXT = "ierdnA si eman ym iH"
		const val EMPTY_TEXT = ""
	}
}
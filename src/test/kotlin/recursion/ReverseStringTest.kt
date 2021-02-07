package recursion

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReverseStringTest {

	@Test
	internal fun `reserve string iterative`() {
		val reverseString = ReverseString()

		val result = reverseString.reverseIterative("yoyo mastery")

		assertThat(result).isEqualTo("yretsam oyoy")
	}

	@Test
	internal fun `reserve string recursive`() {
		val reverseString = ReverseString()

		val result = reverseString.reverseRecursive("yoyo mastery")

		assertThat(result).isEqualTo("yretsam oyoy")
	}
}
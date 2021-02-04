package recursion

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FactorialTest {

	@Test
	internal fun `factorial iterative`() {
		val factorial = Factorial()

		val result = factorial.findFactorialIterative(5)

		assertThat(result).isEqualTo(120)
	}

	@Test
	internal fun `factorial recursive`() {
		val factorial = Factorial()

		val result = factorial.findFactorialRecursive(5)

		assertThat(result).isEqualTo(120)
	}
}
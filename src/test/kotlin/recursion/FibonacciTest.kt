package recursion

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FibonacciTest {

	@Test
	internal fun `iterative fibonacci`() {
		val fibonacci = Fibonacci()

		val value = fibonacci.fibonacciIterativeAtIndex(6)

		assertThat(value).isEqualTo(8)
	}

	@Test
	internal fun `recursive fibonacci`() {
		val fibonacci = Fibonacci()

		val value = fibonacci.fibonacciRecursiveAtIndex(6)

		assertThat(value).isEqualTo(8)
	}
}
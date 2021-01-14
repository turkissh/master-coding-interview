package stacksAndQueues

import org.assertj.core.api.Assertions
import org.junit.Test

class ArrayStackTest {

	@Test
	fun `push values`() {
		val stack = ArrayStack()

		stack.push("google")
		stack.push("udemy")
		stack.push("facebook")

		val value = stack.pop()
		Assertions.assertThat(value).isEqualTo("facebook")
		val value2 = stack.pop()
		Assertions.assertThat(value2).isEqualTo("udemy")
		val value3 = stack.pop()
		Assertions.assertThat(value3).isEqualTo("google")

		Assertions.assertThat(stack.length).isEqualTo(0)
		Assertions.assertThat(stack.isEmpty()).isTrue()
	}

	@Test
	fun `peek value`() {
		val stack = ArrayStack()
		stack.push("google")
		stack.push("udemy")
		stack.push("facebook")

		val peekValue = stack.peek()

		Assertions.assertThat(peekValue).isEqualTo("facebook")
		Assertions.assertThat(stack.length).isEqualTo(3)
	}

	@Test
	fun `pop empty stack`() {
		val stack = ArrayStack()

		val emptyValue = stack.pop()

		Assertions.assertThat(emptyValue).isNull()
	}

}
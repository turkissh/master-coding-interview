package stacksAndQueues.stack

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import stacksAndQueues.stack.ListStack

class ListStackTest {

	@Test
	fun `push values`() {
		val stack = ListStack()

		stack.push("google")
		stack.push("udemy")
		stack.push("facebook")

		val value = stack.pop()
		assertThat(value).isEqualTo("facebook")
		val value2 = stack.pop()
		assertThat(value2).isEqualTo("udemy")
		val value3 = stack.pop()
		assertThat(value3).isEqualTo("google")

		assertThat(stack.length).isEqualTo(0)
		assertThat(stack.isEmpty()).isTrue
	}

	@Test
	fun `peek value`() {
		val stack = ListStack()
		stack.push("google")
		stack.push("udemy")
		stack.push("facebook")

		val peekValue = stack.peek()

		assertThat(peekValue).isEqualTo("facebook")
		assertThat(stack.length).isEqualTo(3)
	}

	@Test
	fun `pop empty stack`() {
		val stack = ListStack()

		val emptyValue = stack.pop()

		assertThat(emptyValue).isNull()
	}
}
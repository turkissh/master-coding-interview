package stacksAndQueues.queue


import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import stacksAndQueues.stack.ListStack

class ListQueueTest {

	@Test
	fun `push values`() {
		val queue = ListQueue()

		queue.enqueue("google")
		queue.enqueue("udemy")
		queue.enqueue("facebook")

		val value = queue.dequeue()
		assertThat(value).isEqualTo("google")
		val value2 = queue.dequeue()
		assertThat(value2).isEqualTo("udemy")
		val value3 = queue.dequeue()
		assertThat(value3).isEqualTo("facebook")

		assertThat(queue.length).isEqualTo(0)
		assertThat(queue.isEmpty()).isEqualTo(true)
	}

	@Test
	fun `peek value`() {
		val queue = ListQueue()
		queue.enqueue("google")
		queue.enqueue("udemy")
		queue.enqueue("facebook")

		val peekValue = queue.peek()

		assertThat(peekValue).isEqualTo("google")
		assertThat(queue.length).isEqualTo(3)
	}

	@Test
	fun `pop empty stack`() {
		val stack = ListStack()

		val emptyValue = stack.pop()

		assertThat(emptyValue).isNull()
	}
}
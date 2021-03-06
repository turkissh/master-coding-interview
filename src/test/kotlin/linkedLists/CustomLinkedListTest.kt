package linkedLists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomLinkedListTest {

	@Test
	internal fun `Save one value`() {
		val customLinkedList = CustomLinkedList(5)

		val values = customLinkedList.returnAll()

		assertThat(values).containsExactly(5)
	}

	@Test
	internal fun `Append value`() {
		val customLinkedList = CustomLinkedList(5)

		customLinkedList.append(20)

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(5, 20)
		assertThat(customLinkedList.length()).isEqualTo(2)
	}

	@Test
	internal fun `Append two value`() {
		val customLinkedList = CustomLinkedList(5)
		customLinkedList.append(20)

		customLinkedList.append(55)

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(5, 20, 55)
		assertThat(customLinkedList.length()).isEqualTo(3)
	}

	@Test
	internal fun `Prepend value`() {
		val customLinkedList = CustomLinkedList(5)

		customLinkedList.prepend(20)

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(20,5)
		assertThat(customLinkedList.length()).isEqualTo(2)
	}

	@Test
	internal fun `Prepend two value`() {
		val customLinkedList = CustomLinkedList(5)
		customLinkedList.prepend(20)

		customLinkedList.prepend(65)

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(65,20,5)
		assertThat(customLinkedList.length()).isEqualTo(3)
	}

	@Test
	internal fun `insert value`() {
		val customLinkedList = CustomLinkedList(5)
		customLinkedList.prepend(20)
		customLinkedList.prepend(65)

		customLinkedList.insert(1, 30)

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(65,30,20,5)
		assertThat(customLinkedList.length()).isEqualTo(4)
	}

	@Test
	internal fun `insert value on head`() {
		val customLinkedList = CustomLinkedList(5)
		customLinkedList.prepend(20)
		customLinkedList.prepend(65)

		customLinkedList.insert(0, 30)

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(30,65,20,5)
		assertThat(customLinkedList.length()).isEqualTo(4)
	}

	@Test
	internal fun `insert value far from length`() {
		val customLinkedList = CustomLinkedList(5)

		customLinkedList.insert(5, 30)

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(5,30)
		assertThat(customLinkedList.length()).isEqualTo(2)
	}

	@Test
	internal fun `remove value`() {
		val customLinkedList = CustomLinkedList(5)
		customLinkedList.prepend(20)
		customLinkedList.prepend(65)

		customLinkedList.remove(1)

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(65,5)
		assertThat(customLinkedList.length()).isEqualTo(2)
	}

	@Test
	internal fun `remove last value`() {
		val customLinkedList = CustomLinkedList(5)
		customLinkedList.prepend(20)
		customLinkedList.prepend(65)

		customLinkedList.remove(2)

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(65,20)
		assertThat(customLinkedList.length()).isEqualTo(2)
	}

	@Test
	internal fun `remove pass last value`() {
		val customLinkedList = CustomLinkedList(5)
		customLinkedList.prepend(20)
		customLinkedList.prepend(65)

		customLinkedList.remove(6)

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(65,20,5)
		assertThat(customLinkedList.length()).isEqualTo(3)
	}

	@Test
	internal fun `reverse to a linked list`() {
		val customLinkedList = CustomLinkedList(5)
		customLinkedList.prepend(20)
		customLinkedList.prepend(65)

		customLinkedList.reverse()

		val values = customLinkedList.returnAll()
		assertThat(values).containsExactly(5,20,65)
		assertThat(customLinkedList.length()).isEqualTo(3)
	}
}
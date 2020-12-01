package hastTables

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CustomHashTableTest {

	@Test
	internal fun `save value`() {
		val customHashTable = CustomHashTable<String, Int>()
		customHashTable.set("grapes", 10000)

		val savedValue = customHashTable.get("grapes")

		assertThat(savedValue).isEqualTo(10000)
	}

	@Test
	internal fun `save many values`() {
		val customHashTable = CustomHashTable<String, Int>()
		customHashTable.set("grapes", 10000)
		customHashTable.set("grapes1", 10001)
		customHashTable.set("grapes2", 10002)

		val savedValue = customHashTable.get("grapes1")

		assertThat(savedValue).isEqualTo(10001)
	}

	@Test
	internal fun `non existing value returns null`() {
		val customHashTable = CustomHashTable<String, Int>()

		val savedValue = customHashTable.get("grapes1")

		assertThat(savedValue).isNull()
	}
}
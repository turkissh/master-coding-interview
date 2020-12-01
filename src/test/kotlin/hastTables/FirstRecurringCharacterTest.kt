package hastTables

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FirstRecurringCharacterTest {

	@Test
	internal fun `recurring number`() {
		val listOfCharacters = listOf(2,5,1,2,3,5,1,2,4)

		val action = FirstRecurringCharacter()
		val recurringCharacter = action(listOfCharacters)

		assertThat(recurringCharacter).isEqualTo(2)
	}

	@Test
	internal fun `recurring number 1`() {
		val listOfCharacters = listOf(2,1,1,2,3,5,1,2,4)

		val action = FirstRecurringCharacter()
		val recurringCharacter = action(listOfCharacters)

		assertThat(recurringCharacter).isEqualTo(1)
	}

	@Test
	internal fun `non recurring number`() {
		val listOfCharacters = listOf<Int>()

		val action = FirstRecurringCharacter()
		val recurringCharacter: Int? = action(listOfCharacters)

		assertThat(recurringCharacter).isNull()
	}
}
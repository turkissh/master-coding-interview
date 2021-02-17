package sorting

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InsertionSortTest {

	@Test
	internal fun sort() {
		val numbers = arrayListOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0);

		val result = InsertionSort().sort(numbers)

		assertThat(result).containsExactly(0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283)
	}
}
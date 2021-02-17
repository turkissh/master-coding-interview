package sorting

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class SelectionSortTest {

	@Test
	internal fun sort() {
		val numbers = arrayListOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0);

		val result = SelectionSort().sort(numbers)

		Assertions.assertThat(result).containsExactly(0,1,2,4,5,6,44,63,87,99,283)
	}

}
package array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumSubarrayTest {

	@Test
	internal fun `subarray 1`() {
		val array = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)

		val action = MaximumSubarray()
		val maxSum = action(array)

		assertThat(maxSum).isEqualTo(6)
	}

	@Test
	internal fun `subarray 2`() {
		val array = intArrayOf(1)

		val action = MaximumSubarray()
		val maxSum = action(array)

		assertThat(maxSum).isEqualTo(1)
	}

	@Test
	internal fun `subarray 3`() {
		val array = intArrayOf(0)

		val action = MaximumSubarray()
		val maxSum = action(array)

		assertThat(maxSum).isEqualTo(0)
	}

	@Test
	internal fun `subarray 4`() {
		val array = intArrayOf(-1)

		val action = MaximumSubarray()
		val maxSum = action(array)

		assertThat(maxSum).isEqualTo(-1)
	}

	@Test
	internal fun `subarray 5`() {
		val array = intArrayOf(-2147483647)

		val action = MaximumSubarray()
		val maxSum = action(array)

		assertThat(maxSum).isEqualTo(-2147483647)
	}

	@Test
	internal fun `subarray 6`() {
		val array = intArrayOf(-2,1)

		val action = MaximumSubarray()
		val maxSum = action(array)

		assertThat(maxSum).isEqualTo(1)
	}

	@Test
	internal fun `subarray 7`() {
		val array = intArrayOf(-1,0,-2)

		val action = MaximumSubarray()
		val maxSum = action(array)

		assertThat(maxSum).isEqualTo(0)
	}

}
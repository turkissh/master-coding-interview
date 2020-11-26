package array

import kotlin.math.max

class MaximumSubarray {

	//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
	//Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
	//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
	//Output: 6
	//Explanation: [4,-1,2,1] has the largest sum = 6.

	operator fun invoke(nums: IntArray): Int {
		var maxSum = nums[0]

		nums.forEachIndexed { index, num ->
			val restNumbers = nums.slice(index + 1 until nums.size)
			var sum = 0

			maxSum = max(maxSum, num)

			for (lastInSequence in restNumbers.indices) {
				sum = num + restNumbers.slice(0..lastInSequence).reduce { acc, i -> acc + i }
				maxSum = max(maxSum, sum)
			}

		}

		return maxSum
	}
}
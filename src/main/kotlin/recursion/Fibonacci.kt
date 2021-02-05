package recursion

class Fibonacci {

	// Given a number N return the index value of the Fibonacci sequence, where the sequence is:
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
	// the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3

	//For example: fibonacciRecursive(6) should return 8

	fun fibonacciIterativeAtIndex(index: Int): Int { //O(N)
		var currentIndex = 2
		if (index < 2) return index

		var previousNumber = 0
		var number = 1
		var value = 1
		while (currentIndex <= index) {
			value = previousNumber + number
			previousNumber = number
			number = value
			currentIndex++
		}

		return value
	}

	fun fibonacciRecursiveAtIndex(index: Int): Int { //O(2^N)
		if (index < 2) return index
		return fibonacciRecursiveAtIndex(index - 1) + fibonacciRecursiveAtIndex(index - 2)
	}
}
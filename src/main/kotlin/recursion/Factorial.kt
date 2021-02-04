package recursion

class Factorial {

	// Write two functions that finds the factorial of any number.
	// One should use recursive, the other should just use a for loop
	// 5! = 5*4*3*2*1

	fun findFactorialRecursive(num: Int): Int {
		if (num == 1) return 1
		return num * findFactorialRecursive(num - 1)
	}

	fun findFactorialIterative(num: Int): Int {
		//code here
		var result = 1
		for (i in 1..num) {
			result *= i
		}
		return result;
	}


}
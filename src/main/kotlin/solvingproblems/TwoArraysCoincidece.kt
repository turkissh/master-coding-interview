package solvingproblems

class TwoArraysCoincidece {

	//Given two arrays create a function that let the user know
	//if the array contains common elements
	//ej ['a','b','c'] - ['x','y','z'] = false
	//ej ['a','b','c'] - ['x','a','z'] = false

	operator fun invoke(array1: Array<Char>, array2: Array<Char>): Boolean {

		//SOLUTION 1 Brute Force
		/*array1.forEach { char ->
			if (array2.contains(char)) return true
		}
		return false   //Time: O(a*b) SpaceComplexity: O(1) */

		//SOLUTION 2 Example with HashMap
		/*val coincidences = mutableMapOf<Char, Boolean>()
		array1.forEach { coincidences[it] = true }

		for (value in array2) {
			if (coincidences.containsKey(value)) {
				return true
			}
		}
		return false //Time: O(a+b) SpaceComplexity: O(a) I dont like the "true" value without use */

		//SOLUTION 3 Kotlin Solution
		/*return array1.any { array2.contains(it) } Time:O(a*b) SpaceComplexity: O(1)  */

		//SOLUTION 4 With Sets
		val elementWithoutRepetitions = joinArraysWithoutRepetitions(array1, array2)
		return elementWithoutRepetitions.size < sumArraySizes(array1, array2) //Time: O(a+b) SpaceComplexity: O(a+b)
	}

	private fun joinArraysWithoutRepetitions(array1: Array<Char>, array2: Array<Char>) =
			array1.plus(array2).toSet()

	private fun sumArraySizes(array1: Array<Char>, array2: Array<Char>) = (array1.size + array2.size)

}
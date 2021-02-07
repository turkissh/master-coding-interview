package recursion

class ReverseString {

	//Implement a function that reverses a string using iteration...and then recursion!
	//'yoyo mastery'
	//should return: 'yretsam oyoy'
	fun reverseIterative(string: String): String { //O(n/2)
		val charArray = string.toCharArray()
		val lastIndex = charArray.size - 1
		val middleIndex = ((charArray.size - 1) / 2)
		for (i in 0..middleIndex) {
			val firstLetter = charArray[i]
			val lastLetter = charArray[lastIndex - i]

			charArray[i] = lastLetter
			charArray[lastIndex - i] = firstLetter
		}

		return charArray.joinToString("")
	}

	fun reverseRecursive(string: String): String {
		return if (string == "") {
			""
		} else {
			reverseRecursive(string.substring(1)) + string[0]
		}
	}
}
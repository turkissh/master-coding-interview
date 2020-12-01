package hastTables

class FirstRecurringCharacter {

	operator fun invoke(characters: List<Int>): Int? {

		val processedCharacters = mutableMapOf<Int,Boolean>()

		characters.forEach { //O(n) with space complexity of O(n)
			if(processedCharacters[it] != null) return it
			processedCharacters[it] = true
		}

		return null
	}

}
package array

class ReverseString {

	//Create a function that can reverse a String
	//"Hi my name is Andrei" -> "ierdnA si eman ym iH"

	operator fun invoke(text: String): String {
		val reversedText = ArrayList<Char>(text.length)
		for (index in text.length - 1 downTo 0) {
			reversedText.add(text[index])
		}

		return reversedText.joinToString("")
	}

}
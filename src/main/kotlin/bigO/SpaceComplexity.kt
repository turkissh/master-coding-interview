package bigO

class SpaceComplexity {

	fun booooo(array: List<Any>) {
		for (value in array) { //Only here we have a variable storage
			println("booooooo")
		}
	} //Space complexity of O(1)

	fun hiArrayNTimes(times: Int): List<Any> {
		val hiArray = mutableListOf<Any>() 	//Create an array
		(0..times).forEach {				//Its filled with N values
			hiArray[it] = "hi"
		}
		return hiArray
	} //Space complexity of O(n)
}
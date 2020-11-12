package bigO

class Exercise1 {

	// What is the Big O of the below function? (Hint, you may want to go line by line)
	/*function funChallenge(input) {
		let a = 10;
		a = 50 + 3;

		for (let i = 0; i < input.length; i++) {
			anotherFunction();
			let stranger = true;
			a++;
		}
		return a;
	}*/

	fun funChallenge(input: List<Any>): Int {
		var a = 10 //O(1)
		a = 50 + 3 //O(1)

		for (value in input) { //O(n)
			anotherFunction() //O(n)
			val stranger = true //O(n)
			a++ //O(n)
		}
		return a //O(1)
	}

	//RESULT: O(3 + 4n) => O(n)

	private fun anotherFunction() {}
}
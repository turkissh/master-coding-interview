package bigO

class Exercise2 {

	// What is the Big O of the below function? (Hint, you may want to go line by line)
	/*function anotherFunChallenge(input) {
		let a = 5;
		let b = 10;
		let c = 50;
		for (let i = 0; i < input; i++) {
			let x = i + 1;
			let y = i + 2;
			let z = i + 3;

		}
		for (let j = 0; j < input; j++) {
			let p = j * 2;
			let q = j * 2;
		}
		let whoAmI = "I don't know";
	}*/

	fun anotherFunChallenge(input: List<Int>) {
		val a = 5 //O(1)
		val b = 10 //O(1)
		val c = 50 //O(1)
		for (i in input) { //O(n)
			val x = i + 1 //O(n)
			val y = i + 2 //O(n)
			val z = i + 3 //O(n)
		}
		for (j in input) { //O(n)
			val p = j * 2 //O(n)
			val q = j * 2 //O(n)
		}

		val whoAmI = "I don't know" //O(1)
	}

	//Result: O(3 + 4n + 3n + 1) => O(n)
}
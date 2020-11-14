package bigO

 class LogAllPairs {

	 companion object {
		 //Log all pairs of an array
		 // values = ["a","b","c","d","e"]
		 fun logPairs(values: List<String>) {

			 for (key in values) {
				 val restOfValues = values.minus(key)
				 for (value in restOfValues) {
					 println("$key,$value")
				 }
			 }
		 }
	 }
}
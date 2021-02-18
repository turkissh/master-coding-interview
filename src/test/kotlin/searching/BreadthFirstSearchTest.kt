package searching

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BreadthFirstSearchTest {

	@Test
	internal fun bfs() {
		val bts = BreadthFirstSearchBST()
		bts.insert(9)
		bts.insert(4)
		bts.insert(6)
		bts.insert(20)
		bts.insert(170)
		bts.insert(15)
		bts.insert(1)

		val result = bts.breadthFirstSearch(170)

		assertThat(result).containsExactly(9,4,20,1,6,15,170)
	}

	@Test
	internal fun bfs2() {
		val bts = BreadthFirstSearchBST()
		bts.insert(9)
		bts.insert(4)
		bts.insert(6)
		bts.insert(20)
		bts.insert(170)
		bts.insert(15)
		bts.insert(1)

		val result = bts.breadthFirstSearch(1)

		assertThat(result).containsExactly(9,4,20,1)
	}
}
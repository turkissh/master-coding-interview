package searching

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class DepthFirstSearchTest {

	@Test
	internal fun dfsInOrder() {
		val bts = DepthFirstSearchBST()
		bts.insert(9)
		bts.insert(4)
		bts.insert(6)
		bts.insert(20)
		bts.insert(170)
		bts.insert(15)
		bts.insert(1)

		val result = bts.dfsInOrder(170)

		Assertions.assertThat(result).containsExactly(1, 4, 6, 9, 15, 20, 170)
	}

	@Test
	internal fun dfsInOrder2() {
		val bts = DepthFirstSearchBST()
		bts.insert(9)
		bts.insert(4)
		bts.insert(6)
		bts.insert(20)
		bts.insert(170)
		bts.insert(15)
		bts.insert(1)

		val result = bts.dfsInOrder(9)

		Assertions.assertThat(result).containsExactly(1, 4, 6, 9)
	}

	@Test
	internal fun dfsPreOrder() {
		val bts = DepthFirstSearchBST()
		bts.insert(9)
		bts.insert(4)
		bts.insert(6)
		bts.insert(20)
		bts.insert(170)
		bts.insert(15)
		bts.insert(1)

		val result = bts.dfsPreOrder(170)

		Assertions.assertThat(result).containsExactly(9, 4, 1, 6, 20, 15, 170)
	}

	@Test
	internal fun dfsPostOrder() {
		val bts = DepthFirstSearchBST()
		bts.insert(9)
		bts.insert(4)
		bts.insert(6)
		bts.insert(20)
		bts.insert(170)
		bts.insert(15)
		bts.insert(1)

		val result = bts.dfsPostOrder(170)

		Assertions.assertThat(result).containsExactly(1, 6, 4, 15, 170, 20, 9)
	}
}
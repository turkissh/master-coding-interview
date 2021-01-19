import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import tree.BinarySearchTree

class BinarySearchTreeTest {

	@Test
	internal fun `insert one value`() {
		val bts = BinarySearchTree()

		bts.insert(9)

		val node = bts.lookup(9)
		assertThat(node).isNotNull
		assertThat(node?.value).isEqualTo(9)
	}

	@Test
	internal fun `insert left value`() {
		val bts = BinarySearchTree()
		bts.insert(9)

		bts.insert(4)

		val node = bts.lookup(4)
		assertThat(node).isNotNull
		assertThat(node?.value).isEqualTo(4)
	}

	@Test
	internal fun `insert right value`() {
		val bts = BinarySearchTree()
		bts.insert(9)
		bts.insert(4)
		bts.insert(6)

		bts.insert(20)

		val node = bts.lookup(20)
		assertThat(node).isNotNull
		assertThat(node?.value).isEqualTo(20)
	}

	@Test
	internal fun `full insert`() {
		val bts = BinarySearchTree()

		bts.insert(9)
		bts.insert(4)
		bts.insert(6)
		bts.insert(20)
		bts.insert(170)
		bts.insert(15)
		bts.insert(1)

		val bottomLeftNode = bts.lookup(1)
		assertThat(bottomLeftNode).isNotNull
		assertThat(bottomLeftNode?.value).isEqualTo(1)
		assertThat(bottomLeftNode?.leftChild).isNull()
		assertThat(bottomLeftNode?.rightChild).isNull()

		val bottomRightNode = bts.lookup(170)
		assertThat(bottomRightNode).isNotNull
		assertThat(bottomRightNode?.value).isEqualTo(170)
		assertThat(bottomRightNode?.leftChild).isNull()
		assertThat(bottomRightNode?.rightChild).isNull()

		val middleRightNode = bts.lookup(20)
		assertThat(middleRightNode).isNotNull
		assertThat(middleRightNode?.value).isEqualTo(20)
		assertThat(middleRightNode?.leftChild?.value).isEqualTo(15)
		assertThat(middleRightNode?.rightChild?.value).isEqualTo(170)
	}

	@Test
	internal fun `traverse`() {
		val bts = BinarySearchTree()
		bts.insert(9)
		bts.insert(4)
		bts.insert(6)
		bts.insert(20)
		bts.insert(170)
		bts.insert(15)
		bts.insert(1)

		val traversedTree = bts.traverse()

		assertThat(traversedTree).containsExactly(1,4,6,9,15,20,170)
	}
}
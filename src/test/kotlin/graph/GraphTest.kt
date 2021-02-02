package graph

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GraphTest {

	@Test
	internal fun `add vertex`() {
		val graph = Graph()

		graph.addVertex(0);

		val nodes = graph.getConnections()
		assertThat(nodes[0]).isEmpty()
		assertThat(graph.numberOfNodes).isEqualTo(1)
	}

	@Test
	internal fun `add edge`() {
		val graph = Graph()
		graph.addVertex(0);
		graph.addVertex(1);

		graph.addEdge(0,1)

		val nodes = graph.getConnections()
		assertThat(nodes[0]).contains(1)
		assertThat(graph.numberOfNodes).isEqualTo(2)
	}

	@Test
	internal fun `full graph`() {
		val myGraph = Graph()

		myGraph.addVertex(0);
		myGraph.addVertex(1);
		myGraph.addVertex(2);
		myGraph.addVertex(3);
		myGraph.addVertex(4);
		myGraph.addVertex(5);
		myGraph.addVertex(6);
		myGraph.addEdge(3, 1);
		myGraph.addEdge(3, 4);
		myGraph.addEdge(4, 2);
		myGraph.addEdge(4, 5);
		myGraph.addEdge(1, 2);
		myGraph.addEdge(1, 0);
		myGraph.addEdge(0, 2);
		myGraph.addEdge(6, 5);

		val nodes = myGraph.getConnections()
		assertThat(nodes[0]).contains(1,2)
		assertThat(nodes[1]).contains(0,2,3)
		assertThat(nodes[2]).contains(0,1,4)
		assertThat(nodes[3]).contains(1,4)
		assertThat(nodes[4]).contains(2,3,5)
		assertThat(nodes[5]).contains(4,6)
		assertThat(nodes[6]).contains(5)
		assertThat(myGraph.numberOfNodes).isEqualTo(7)
	}
}
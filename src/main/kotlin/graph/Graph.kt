package graph

class Graph {

	var numberOfNodes = 0
	private val adjacentList = mutableMapOf<Int,MutableList<Int>>()

	fun addVertex(node: Int) {
		if(!adjacentList.contains(node)) {
			adjacentList.putIfAbsent(node, mutableListOf())
			numberOfNodes++
		}
	}

	//Undirected
	fun addEdge(node1: Int, node2: Int) {
		adjacentList[node1]?.add(node2)
		adjacentList[node2]?.add(node1)
	}

	fun getConnections(): MutableMap<Int, MutableList<Int>> {
		return adjacentList
	}
}
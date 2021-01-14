package stacksAndQueues.queue

interface Queue {
	fun peek(): Any?
	fun enqueue(value: Any)
	fun dequeue(): Any?
	fun isEmpty(): Boolean
}
package stacksAndQueues.stack

interface Stack {
	fun peek(): Any?
	fun push(value: Any)
	fun pop(): Any?
	fun isEmpty(): Boolean
}
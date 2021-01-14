package stacksAndQueues

import stacksAndQueues.queue.Queue
import stacksAndQueues.stack.ListStack
import kotlin.math.max

//Implement a first in first out (FIFO) queue using only two stacks.
//The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
class QueueWithStacks : Queue {

	var stack = ListStack()
	var stackAsQueue = ListStack()
	var length = 0

	override fun peek(): Any? {
		return stackAsQueue.peek()
	}

	override fun enqueue(value: Any) {
		restoreValues()
		stack.push(value)
		enqueueNewValue()
		incrementLength()
	}

	override fun dequeue(): Any? {
		decrementLength()
		return stackAsQueue.pop()
	}

	override fun isEmpty(): Boolean {
		return stackAsQueue.isEmpty()
	}

	private fun enqueueNewValue() {
		stackAsQueue = ListStack()
		for (i in 1..stack.length) {
			stackAsQueue.push(stack.pop()!!)
		}
	}

	private fun restoreValues() {
		stack = ListStack()
		for (i in 1..stackAsQueue.length) {
			stack.push(stackAsQueue.pop()!!)
		}
	}

	private fun incrementLength() {
		length++
	}

	private fun decrementLength() {
		length = max(length - 1, 0)
	}
}
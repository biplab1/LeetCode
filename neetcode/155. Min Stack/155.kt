/*
Method 1.0: Use a linked list where a node has three things- val, minVal, next pointer
Now, a new val is added and minVal updated, head always points to the latest entry and has
the current minVal.
To pop, move the head to next.
TC: O(1) all operations
 */

class MinStack() {
    private var head: Node? = null

    fun push(`val`: Int) {
        if (head == null) {
            head = Node(`val`, `val`, null)
        } else {
            head = Node(`val`, minOf(`val`, head!!.minVal), head)
        }
    }

    fun pop() {
        head = head?.next
    }

    fun top(): Int {
        return head?.data ?: -1
    }

    fun getMin(): Int {
        return head?.minVal ?: -1
    }

    private class Node(val data: Int, val minVal: Int, val next: Node?)

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */

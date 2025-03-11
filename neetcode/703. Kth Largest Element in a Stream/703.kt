/*
Method 1.0
Intuition: Use min heap to get rid of the marks less than Kth Largest
TC: O(N log K), where N is number of add calls
TC: O(K), where K is size of priority queue
 */

class KthLargest(k: Int, nums: IntArray) {
    val minQ = PriorityQueue<Int>()
    val size = k

    init {
        for (i in nums) {
            add(i)
        }
    }

    fun add(`val`: Int): Int {
        minQ.offer(`val`)
        if (minQ.size > size) {
            minQ.poll()
        }

        return minQ.peek()
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */

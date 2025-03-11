/*
Method 1.0:
Intuition: use max heap to get the heaviest stones at top
Another approach: use sorted array and a pointer to keep track of heaviest stones
TC: O(N log N)
SC: O(N), number of stones
 */

class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val maxH = PriorityQueue<Int>{ a, b -> b - a }

        for (stone in stones) {
            maxH.offer(stone)
        }

        while (maxH.size > 1) {
            val first = maxH.poll()
            val second = maxH.poll()

            if (first != second) {
                maxH.offer(first - second)
            }
        }

        return if (maxH.isNotEmpty()) maxH.peek() else 0
    }
}

/*
Method 1.0: Using stack
Intution: a height can only be expanded into lower heights, so we stop at the next smallest heights
on both sides of that height. Next smallest heights are tracked using stack. Finally, calculate areas
associated with each height and find the max area.
TC: O(N)
SC: O(N)
 */

class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val left = nextSmallestLeft(heights)
        val right = nextSmallestRight(heights)

        var maxArea = 0

        for (i in 0 until heights.size) {
            maxArea = max(maxArea, heights[i] * (right[i] - left[i] - 1))
        }

        return maxArea
    }

    private fun nextSmallestLeft(heights: IntArray): IntArray {
        val left = IntArray(heights.size)
        val stack: Deque<Int> = LinkedList()

        for (i in heights.indices) {
            while (stack.isNotEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop()
            }

            if (stack.isEmpty()) {
                left[i] = -1
            } else {
                left[i] = stack.peek()
            }

            stack.push(i)
        }

        return left
    }

    private fun nextSmallestRight(heights: IntArray): IntArray {
        val right = IntArray(heights.size)
        val stack: Deque<Int> = LinkedList()

        var index = heights.size - 1

        for (i in heights.size - 1 downTo 0) {
            while (stack.isNotEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop()
            }

            if (stack.isEmpty()) {
                right[index--] = heights.size
            } else {
                right[index--] = stack.peek()
            }

            stack.push(i)
        }

        return right
    }
}

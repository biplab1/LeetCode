class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0

        while (left < right) {
            val minHeight = min(height[left], height[right])

            maxArea = max(maxArea, minHeight * (right - left))

            while (left < right && height[left] <= minHeight) {
                left++
            }

            while (left < right && height[right] <= minHeight) {
                right--
            }
        }

        return maxArea
    }
}

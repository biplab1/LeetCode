/*
Method 1.0: Water is held between left max and right max for each height, and sum over water above each height
obtained by subtracting individual height from its min(right max, left max). Total 3 passes made
TC: O(N), N is number of elements in height array
SC: O(N), Arrays for storing left and right Max for each height
 */

class Solution {
    fun trap(height: IntArray): Int {
        val n = height.size
        var totalWater = 0

        val leftMaxArray = IntArray(n)
        val rightMaxArray = IntArray(n)

        var leftMax = 0

        for (i in 0 until n) {
            leftMax = max(leftMax, height[i])
            leftMaxArray[i] = leftMax
        }

        var rightMax = 0

        for (i in n - 1 downTo 0) {
            rightMax = max(rightMax, height[i])
            rightMaxArray[i] = rightMax
        }

        for (i in 0 until n) {
            totalWater += min(rightMaxArray[i], leftMaxArray[i]) - height[i]
        }

        return totalWater
    }
}

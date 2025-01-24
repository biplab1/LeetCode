/*
Method 1.0: Two pointers
TC: O(N)
SC: O(1)
 */

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1

        while (left < right) {
            val currTotal = numbers[left] + numbers[right]

            if (currTotal == target) {
                return intArrayOf(left + 1, right + 1)
            } else if (currTotal < target) {
                left++
            } else {
                right--
            }
        }

        return intArrayOf(-1, -1)
    }
}

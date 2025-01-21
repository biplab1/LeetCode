/*
Method 1: Two pointer, TC: O(N^2), SC: O(1)
 */
class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort()

        for (i in 0 until nums.size - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) continue

            val target = -nums[i];

            var j = i + 1
            var k = nums.size - 1

            while (j < k) {
                val sum = nums[j] + nums[k]

                when {
                    sum == target -> {result.add(listOf(nums[i], nums[j], nums[k]))
                        while (j < k && nums[j] == nums[j + 1]) j++
                        while (j < k && nums[k] == nums[k - 1]) k--
                        j++
                        k--
                    }
                    sum < target -> j++
                    else -> k--
                }
            }
        }

        return result
    }
}

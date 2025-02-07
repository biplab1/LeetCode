/*
Method 1.0:
Intuition: use a map to keep track of the element and its index, check if target - num is present
in map, then return indices
TC: O(N)
SC: O(N)
 */

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }

            map[nums[i]] = i
        }

        return intArrayOf(-1, -1)
    }
}

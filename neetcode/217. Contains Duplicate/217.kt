/*
Method 1.0:
Intution: Build a set, if a number appears more than once, adding to set will return false
TC: O(N)
SC: O(N), it can be done in O(1) also without using a set
 */

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = HashSet<Int>()

        for (num in nums) {
            if (!set.add(num)) return true
        }

        return false
    }
}

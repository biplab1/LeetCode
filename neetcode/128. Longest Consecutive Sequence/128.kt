class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val n = nums.size
        if (n <= 1) return n

        nums.sort()
        var currLen = 1
        var maxLen = 1

        for (i in 1 until n) {
            var diff = nums[i] - nums[i - 1]
            if (diff == 0) continue

            if (diff == 1) {
                currLen++
                maxLen = max(maxLen, currLen);
            } else {
                currLen = 1
            }
        }

        return maxLen;
    }
}

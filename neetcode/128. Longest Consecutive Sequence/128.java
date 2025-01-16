class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) return nums.length;

        Arrays.sort(nums);

        int currLen = 1;
        int maxLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 0) continue;
            if (nums[i] - nums[i - 1] == 1) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
        }

        return maxLen;
    }
}

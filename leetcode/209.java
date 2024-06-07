class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = nums.length + 1;

        int i = 0;
        int j = 0;
        int sum = 0;

        while (j < nums.length) {
            sum += nums[j];

            if (sum < target) {
                j++;
            } else if (sum >= target) {
                while (sum >= target && i <= j) {
                    minLen = Math.min(minLen, j - i + 1);
                    sum -= nums[i];
                    i++;
                }
                j++;
            }
        }

        return minLen != nums.length + 1 ? minLen : 0;
    }
}
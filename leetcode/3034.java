class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length;
        int m = pattern.length;
        int count = 0;
        
        outer:
        for (int i = 0; i < n - m; i++) {
            for (int k = 0; k < m; k++) {
                if (Integer.signum(nums[i + k + 1] - nums[i + k]) != pattern[k]) {
                    continue outer;
                }
            }
            count++;
        }
        
        return count;
    }
}
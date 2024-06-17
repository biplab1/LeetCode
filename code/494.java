class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       int sum = 0;
       int d = target;
       int n = nums.length;
        
        for (int num : nums) {
            sum += num;
        }
        if ((sum + d) < 0 || (sum + d) % 2 != 0) return 0;
        
        int newSum = (sum + d)/2;
        
        int[][] t = new int[n + 1][newSum + 1];
        
        t[0][0] = 1;
        
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < newSum + 1; j++) {
                if (nums[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - nums[i - 1]] + 
                                        t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        
        return t[n][newSum];
    }
}
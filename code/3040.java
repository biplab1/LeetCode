class Solution {
    static Integer[][] dp;

    public int maxOperations(int[] nums) {
        int n = nums.length;
        int result = 0;

        dp = new Integer[n][n];
        result = Math.max(result, solve(nums, 0, n - 1, nums[0] + nums[1]));

        dp = new Integer[n][n];
        result = Math.max(result, solve(nums, 0, n - 1, nums[n - 1] + nums[n - 2]));

        dp = new Integer[n][n];
        result = Math.max(result, solve(nums, 0, n - 1, nums[0] + nums[n - 1]));
        
        return result;
    }

    private int solve(int[] nums, int i, int j, int score) {
        if (j - i + 1 < 2) return 0;
        
        if (dp[i][j] != null) return dp[i][j];
        int ans = 0;

        if (nums[i] + nums[i + 1] == score) {
            ans = Math.max(ans, 1 + solve(nums, i + 2, j, score));
        }

        if (nums[j - 1] + nums[j] == score) {
            ans = Math.max(ans, 1 + solve(nums, i, j - 2, score ));
        }

        if (nums[i] + nums[j] == score) {
            ans = Math.max(ans, 1 + solve(nums, i + 1, j - 1, score));
        }

        return dp[i][j] = ans;
    }
}
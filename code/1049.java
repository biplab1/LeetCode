class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;

        for (int num : stones) {
            sum += num;
        }

        boolean[][] dp = new boolean[n + 1][sum/2 + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum/2 + 1; j++) {
                if (stones[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - stones[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int minDiff = Integer.MAX_VALUE;

        for (int i = sum/2; i >= 0; i--) {
            if (dp[n][i]) {
                return sum - 2 * i;
            }
        }

        return 0;
    }
}
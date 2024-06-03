class Solution {
    int[][] dp;
    public int numTrees(int n) {
        dp = new int[n + 1][n + 1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        return solve(1, n);
    }

    private int solve(int i, int j) {
        if (i >= j) {
            return 1;
        }
        if (dp[i][j] != -1) return dp[i][j];
        int count = 0;

        for (int k = i; k <= j; k++) {
            int left = solve(i, k - 1);
            int right = solve(k + 1, j);
            count += left * right;
        }

        return dp[i][j] = count;
    }
}
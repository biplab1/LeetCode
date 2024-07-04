class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // initialization requires first row and column to be zero for LCS
        int lcs = 0;

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    lcs = Math.max(lcs, dp[i][j]);
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return m + n - 2 * lcs;
    }
}
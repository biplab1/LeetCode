/*
Method 1: Top Down DP, Recursive with Memoization
 */
class Solution {
    int[][] dp;
    public int maximalSquare(char[][] matrix) {
        dp = new int[matrix.length][matrix[0].length];
        int maxLen = 0;

        for (int[] d : dp) Arrays.fill(d, -1);

        int x = solve(matrix, 0, 0);

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                maxLen = Math.max(maxLen, dp[i][j]);
            }
        }

        return maxLen * maxLen;

    }

    private int solve(char[][] matrix, int row, int col) {
        if (row >= matrix.length || col >= matrix[0].length) return 0;

        if (dp[row][col] != -1) return dp[row][col];

        int right = solve(matrix, row, col + 1);
        int down = solve(matrix, row + 1, col);
        int diag = solve(matrix, row + 1, col + 1);

        dp[row][col] = 0;

        if (matrix[row][col] == '1')
            dp[row][col] = 1 + Math.min(right, Math.min(down, diag));

        return dp[row][col];
    }
}

/*
Method 2.0: Bottom Up DP
 */
/*
class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxLen = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 || j == 0) {
                    maxLen = Math.max(maxLen, matrix[i][j] - '0');
                } else if (matrix[i][j] == '1') {
                    int left = matrix[i][j - 1] - '0';
                    int top = matrix[i - 1][j] - '0';
                    int diag = matrix[i - 1][j - 1] - '0';

                    matrix[i][j] = (char) ('0' + 1 + Math.min(left, Math.min(top, diag)));
                    maxLen = Math.max(maxLen, matrix[i][j] - '0');
                }
            }
        }

        return maxLen * maxLen;
    }
}
 */

/*
Method 2.2: Bottom UP DP
 */
/*
class Solution {
    public int maximalSquare(char[][] matrix) {
        int maxLen = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    int left = dp[i][j - 1];
                    int top = dp[i - 1][j];
                    int diag = dp[i - 1][j - 1];

                    dp[i][j] = 1 + Math.min(left, Math.min(top, diag));
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }

        return maxLen * maxLen;
    }
}
 */

class Solution {
    int rows;
    int cols;
    int[][] grid;
    int[][] dp;

    public int longestIncreasingPath(int[][] matrix) {
        int longestPath = 0;
        rows = matrix.length;
        cols = matrix[0].length;

        grid = matrix;
        dp = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dp[i][j] == 0) {
                    longestPath = Math.max(longestPath, dfs(i, j));
                }
            }
        }

        return longestPath;
    }

    private int dfs(int row, int col) {
        if (dp[row][col] != 0) return dp[row][col];

        int[] directions = {-1, 0, 1, 0, -1};

        for (int k = 0; k < 4; k++) {
            int nextRow = row + directions[k];
            int nextCol = col + directions[k + 1];

            if (isValid(nextRow, nextCol, row, col)) {
                dp[row][col] = Math.max(dp[row][col], dfs(nextRow, nextCol));
            }
        }

        return ++dp[row][col];
    }

    private boolean isValid(int currRow, int currCol, int prevRow, int prevCol) {
        if (currRow >= 0 && currRow < rows && currCol >= 0 && currCol < cols &&
                grid[currRow][currCol] > grid[prevRow][prevCol]) {
            return true;
        }
        return false;
    }
}

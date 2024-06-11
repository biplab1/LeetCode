class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        int result = n * (1 << (m - 1));

        for (int j = 1; j < m; j++) {
            int curr = 0;

            for (int i = 0; i < n; i++) {
                curr += grid[i][j] == grid[i][0] ? 1 : 0;
            }

            result += Math.max(curr, n - curr) * (1 << (m - j - 1));
        }

        return result;
    }
}
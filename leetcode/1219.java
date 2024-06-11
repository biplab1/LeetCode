class Solution {
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxGold = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, dfs(grid, i, j, n, m));
                }  
            }
        }

        return maxGold;
    }

    private int dfs(int[][] grid, int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0) {
            return 0;
        }

        int curr = grid[i][j];
        grid[i][j] = 0;

        int currMax = curr;

        for (int[] d : directions) {
            int newI = i + d[0];
            int newJ = j + d[1];
            currMax = Math.max(currMax, curr + dfs(grid, newI, newJ, n, m));
        }

        grid[i][j] = curr;

        return currMax;
    }
}
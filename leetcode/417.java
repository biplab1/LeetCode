class Solution {
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        List<List<Integer>> result = new ArrayList<>();

        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0) dfs(pacific, heights, i, j, 0);
                if (i == n - 1 || j == m - 1) dfs(atlantic, heights, i, j, 0);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    private void dfs(boolean[][] grid, int[][] heights, int i, int j, int prevHeight) {
        if (i >= grid.length || i < 0 || 
            j >= grid[0].length || j < 0 || 
            grid[i][j] ||
            heights[i][j] < prevHeight)
            return;

        grid[i][j] = true;

        int curr = heights[i][j];

        dfs(grid, heights, i - 1, j, curr); 
        dfs(grid, heights, i, j + 1, curr);
        dfs(grid, heights, i + 1, j, curr);
        dfs(grid, heights, i, j - 1, curr);
    }
}
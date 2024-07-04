class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    perimeter += 4;
                    if (row >= 1 && grid[row-1][col] == 1) {
                        perimeter -= 2;
                    }
                    if (col >= 1 && grid[row][col-1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}
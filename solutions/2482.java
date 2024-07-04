class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[] onesRow = new int[rows];
        int[] onesCol = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }

        int[][] diff = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                diff[i][j] = 2 * onesRow[i] + 2 * onesCol[j] - rows - cols;
            }
        }

        return diff;

    }
}
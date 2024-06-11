class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) return matrix[0][0];

        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int minPrev = Integer.MAX_VALUE;
                if (col > 0) {
                    minPrev = Math.min(minPrev, matrix[row - 1][col - 1]);
                }
                minPrev = Math.min(minPrev, matrix[row - 1][col]);
                if (col < cols - 1) {
                    minPrev = Math.min(minPrev, matrix[row - 1][col + 1]);
                }
                matrix[row][col] += minPrev;
            }
        }

        int minSum = Integer.MAX_VALUE;

        for (int num : matrix[rows - 1]) {
            minSum = Math.min(minSum, num);
        }

        return minSum;
    }

}
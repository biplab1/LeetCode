class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int start = matrix[0][0];
        int end = matrix[n - 1][n - 1];

        while (start < end) {
            int mid = start + (end - start) / 2;

            int[] smallLarge = {matrix[0][0], matrix[n - 1][n - 1]};

            int count = countLessEqual(matrix, mid, smallLarge);

            if (count == k) {
                return smallLarge[0];
            } else if (count < k) {
                start = smallLarge[1];
            } else {
                end = smallLarge[0];
            }
        }

        return start;
    }

    private int countLessEqual(int[][] matrix, int mid, int[] smallLarge) {
        int n = matrix.length;
        int row = n - 1;
        int col = 0;
        int count = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] > mid) {
                smallLarge[1] = Math.min(smallLarge[1], matrix[row][col]);
                row--;
            } else {
                smallLarge[0] = Math.max(smallLarge[0], matrix[row][col]);
                count += row + 1;
                col++;
            }
        }
        return count;
    }
}
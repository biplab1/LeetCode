/*
 * Method 1.0:
 */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int start = 0;
        int end = n * m - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int i = mid / m;
            int j = mid % m;
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}

/*
 * Method 1.1:
 */
/*
 * class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}
 */
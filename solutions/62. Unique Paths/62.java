/*
Method 1: Using DP
TC: O(m * n)
SC: O(m * n)
*/

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) grid[i][j] = 1;
                else grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
            }
        }

        return grid[m - 1][n - 1];
    }
}


/*
Method 2: Combinatorics
TC: Min(m, n)
SC: O(1)
*/

/*

class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) return 1;

        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        m--;
        n--;

        long ans = 1;

        for (int i = m + 1, j = 1; i <= m + n; i++, j++) {
            ans *= i;
            ans /= j;
        }

        return (int) ans;
    }
}

*/
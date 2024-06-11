class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {
        int n = grid.length;

        int ops = n * n + 1;

        for (int y = 0; y <= 2; y++) {
            for (int z = 0; z <= 2; z++) {
                if (y == z) continue;
                int diff = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == j && i <= n/2) {
                            if (y != grid[i][j]) diff++;
                        }
                        else if (i + j == n - 1 && i < n/2) {
                            if (y != grid[i][j]) diff++;
                        }
                        else if (i > n/2 && j == n/2) {
                            if (y != grid[i][j]) diff++;
                        } 
                        else if (z != grid[i][j]) diff++;
                    }
                }
                ops = Math.min(ops, diff);
            }
        }

        return ops;
    }
}
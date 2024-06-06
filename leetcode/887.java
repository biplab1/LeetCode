class Solution {
    int[][] dp;
    public int superEggDrop(int k, int n) {
        dp = new int[k + 1][n + 1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }
        return solve(k, n);
    }

    private int solve(int e, int f) {
        if (f <= 1 || e == 1) return f;

        if (dp[e][f] != -1) return dp[e][f];

        int minMoves = Integer.MAX_VALUE;

        int bottom = 1, top = f;

        while (bottom <= top) {
            int mid = bottom + (top - bottom) / 2;
            int eggBreak = 0, noBreak = 0;

            if (dp[e - 1][mid - 1] != -1) eggBreak = dp[e - 1][mid - 1];
            else {
                eggBreak = solve(e - 1, mid - 1);
                dp[e - 1][mid - 1] = eggBreak;
            }
            if (dp[e][f - mid] != -1) noBreak = dp[e][f - mid];
            else {
                noBreak = solve(e, f - mid);
                dp[e][f - mid] = noBreak;
            }

            int temp = 1 + Math.max(noBreak, eggBreak);
            minMoves = Math.min(temp, minMoves);

            if (eggBreak > noBreak) {
                top = mid - 1;
            } else {
                bottom = mid + 1; 
            }
        }

        return dp[e][f] = minMoves;
    }
}
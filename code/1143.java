class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] t = new int[n + 1][m + 1];
        for (int[] x : t) {
            Arrays.fill(x, -1);
        }

        return LCS(text1, text2, n, m, t);
    }

    private int LCS(String X, String Y, int n, int m, int[][] t) {
        if (n == 0 || m == 0) return t[n][m] = 0;

        char x = X.charAt(n - 1);
        char y = Y.charAt(m - 1);

        if (t[n][m] != -1) return t[n][m];

        if (x == y) {
            return t[n][m] = 1 + LCS(X, Y, n - 1, m - 1, t);
        } else {
            return t[n][m] = Math.max(LCS(X, Y, n - 1, m, t), LCS(X, Y, n, m - 1, t));
        }
    }
}
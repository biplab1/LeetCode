class Solution {
    public int minInsertions(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder(s);

        String reverse = sb.reverse().toString();

        int[][] t = new int[n + 1][n + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (s.charAt(i - 1) == reverse.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i][j - 1], t[i - 1][j]);
                }
            }
        }

        return n - t[n][n];
    }
}
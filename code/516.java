class Solution {
    public int longestPalindromeSubseq(String s) {
        //StringBuilder sb = new StringBuilder(s);
        
        //String reverse = sb.reverse().toString();
        
        int n = s.length();
        
        int[][] t = new int[n + 1][n + 1];
        
        for (int i = 1; i < n + 1; i++) {
            for (int j = n; j > 0; j--) {
                if (s.charAt(i - 1) == s.charAt(j - 1)) {
                    t[i][n + 1 - j] = 1 + t[i - 1][n - j];
                } else {
                    t[i][n + 1 - j] = Math.max(t[i][n - j], t[i - 1][n - j + 1]);
                }
            }
        }
        
        return t[n][n];
    }
}
/*
Method 1:
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
       int n = s.length();
       int m = t.length();

       int[][] dp = new int[n + 1][m + 1];

       for (int i = 1; i < n + 1; i++) {
           for (int j = 1; j < m + 1; j++) {
               if (s.charAt(i - 1) == t.charAt(j - 1)) {
                   dp[i][j] = 1 + dp[i - 1][j - 1];
               } else {
                   dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
               }
           }
       }

       return dp[n][m] == s.length();
    }
}

/*
Method 2:
*/
/*
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        int lenT = t.length();
        int lenS = s.length();

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        if (lenS < 1) return true;

        while (i < lenT) {
            if (tt[i] == ss[j]) {
                j++;
            }
            i++;
            if (j == lenS) return true;
        }
        
        return false;
    }
}
*/


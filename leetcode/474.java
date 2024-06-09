class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int index = 0;

        int[][] dp = new int[m + 1][n + 1];
        
        for (String s : strs) {
            int[] count = new int[2];
            count = countZerosOnes(s);
            int zeros= count[0];
            int ones = count[1];

            for (int j = m; j >= zeros; j--) {
                for (int k = n; k >= ones; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - zeros][k - ones] + 1);
                }
            }
        }

        return dp[m][n];
    }

    private int[] countZerosOnes(String s) {
        int[] zerosOnes = new int[2];
        for (char c : s.toCharArray()) {
            zerosOnes[c - '0']++;
        }

        return zerosOnes;
    }
}
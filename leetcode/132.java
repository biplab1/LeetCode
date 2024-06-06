class Solution {
    public int minCut(String s) {
        int n = s.length();
        
        boolean[][] isPalindrome = new boolean[n][n];
        
        int[] minCuts = new int[n];
        
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
            minCuts[i] = i;
        }
        
        for (int length = 2; length <= n; length++) {
            for (int start = 0; start <= n - length; start++) {
                int end = start + length - 1;
                
                if (length == 2) {
                    isPalindrome[start][end] = (s.charAt(start) == s.charAt(end));
                } else {
                    isPalindrome[start][end] = (s.charAt(start) == s.charAt(end) && isPalindrome[start + 1][end - 1]);
                }
            }
        }
        
        for (int i = 1; i < n; i++) {
            if (isPalindrome[0][i]) {
                minCuts[i] = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    if (isPalindrome[j + 1][i]) {
                        minCuts[i] = Math.min(minCuts[i], minCuts[j] + 1);
                    }
                }
            }
        }
        
        return minCuts[n - 1];
    }
}

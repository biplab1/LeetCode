
/*
 * Method 1: Iterative DP
 */

 

/*
 * Method 2: Recursion with Memoization (DP)
 */
/*
 * class Solution {

    int[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        
        dp = new int[s.length()];
        Arrays.fill(dp, -1);

        return solve(s, wordDict, 0);
    }

    private boolean solve(String s, List<String> wordDict, int index) {
        if (index == s.length()) return true;

        if (dp[index] != -1) return dp[index] == 1;

        boolean flag = false;
        for (String str : wordDict) {
            if (s.startsWith(str, index) && solve(s, wordDict, index + str.length())) {
                flag = true;
                break;
            }
        }

        dp[index] = flag ? 1 : 0;

        return dp[index] == 1;
    }
}
 */

/*
 * Method 3: Recursion with Memoization (DP)
 */
/*
 * class Solution {

    Boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        dp = new Boolean[s.length()];

        return solve(s, set, 0);
    }

    private boolean solve(String s, Set<String> set, int index) {
        if (index == s.length()) return true;

        if (dp[index] != null) return dp[index];

        for (int k = index; k < s.length(); k++) {
            if (set.contains(s.substring(index, k + 1)) && solve(s, set, k + 1)) {
                return dp[index] = true;
            }
        }
        return dp[index] = false;
    }
}
 */

 /*
 * Method 4: Recursion
 */
/*
 * class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);

        return solve(s, set, 0);
    }

    private boolean solve(String s, Set<String> set, int index) {
        if (index == s.length()) return true;

        for (int k = index; k < s.length(); k++) {
            if (set.contains(s.substring(index, k + 1)) && solve(s, set, k + 1)) {
                return true;
            }
        }
        return false;
    }
}
 */
/*
 * Method 5: Recursion
 */
/*
 * class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return solve(s, wordDict, 0);
    }

    private boolean solve(String s, List<String> wordDict, int index) {
        if (index == s.length()) return true;

        boolean flag = false;
        for (String str : wordDict) {
            if (s.startsWith(str, index) && solve(s, wordDict, index + str.length())) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}
 */
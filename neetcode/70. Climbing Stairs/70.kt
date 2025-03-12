/*
Method 1.0:
Intuition: Choices, overlapping subproblems -> DP. Using array, zeroth step reached in one way,
first step reached in 1 way. ith step reachable from (i - 1)th and (i - 2)th steps. Pull DP

TC: O(N)
SC: O(N), reduced to O(1) if one uses a, b, c and think of Fibonannci sequence.
 */

class Solution {
    fun climbStairs(n: Int): Int {
        val dp = IntArray(n + 1)

        dp[0] = 1
        dp[1] = 1

        for (i in 2..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }

        return dp[n]
    }
}

/*
Method 1.0:
Intuition: Choices, repeated subproblems, DP, ith step cost is the minimum of the cost to reach
(i - 1)th and (i - 2)th steps
TC: O(N)
SC: O(1)
 */

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var a = 0
        var b = 0

        for (i in 2..cost.size) {
            val c = minOf(b + cost[i - 1], a + cost[i - 2])

            a = b
            b = c
        }

        return b
    }
}

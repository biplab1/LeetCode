/*
Method 1.0:
Intuition: Choices, repeated subproblems, DP, ith step cost is the minimum of the cost to reach
(i - 1)th and (i - 2)th steps
TC: O(N)
SC: O(1)
 */

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = 0;
        int b = 0;

        for (int i = 2; i <= cost.length; i++) {
            int c = Math.min(a + cost[i - 2], b + cost[i - 1]);

            a = b;
            b = c;
        }

        return b;
    }
}

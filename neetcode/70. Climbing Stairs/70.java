/*
Method 1.0:
Intuition: Choices, overlapping subproblems -> DP. Using array, zeroth step reached in one way,
first step reached in 1 way. ith step reachable from (i - 1)th and (i - 2)th steps. Pull DP

TC: O(N)
SC: O(N), reduced to O(1) if one uses a, b, c and think of Fibonannci sequence.
 */

class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;

        int c = 1;

        for (int i = 2; i < n + 1; i++) {
            c = a + b;
            b = a;
            a = c;
        }

        return c;
    }
}

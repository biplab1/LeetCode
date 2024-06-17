class Solution {
    public int climbStairs(int n) {
        int[] t = new int[n+1];
        Arrays.fill(t, -1);
        return ways(n, 0, t);
    }

    private int ways(int n, int start, int[] t) {
        if (start == n) {
            return 1;
        }

        if (t[start] != -1) {
            return t[start];
        }

        t[start] = ways(n, start + 1, t);
        if (start < n - 1) t[start] += ways(n, start + 2, t);

        return t[start];
    }
}
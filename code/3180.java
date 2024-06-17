class Solution {
    public int maxTotalReward(int[] r) {
        Arrays.sort(r);

        int max = r[r.length - 1];

        int[] dp = new int[2 * max + 1];
        int ans = 0;

        for (int num : r) {
            for (int i = 0; i < num; i++) {
                if (dp[i + num] < dp[i] + num) {
                    dp[i + num] = num + dp[i];
                    ans = Math.max(dp[i + num], ans);
                }
            }
        }

        return ans;
    }
}
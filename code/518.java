class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];

        // if amount is zero, then you can take zero coins, # of ways is 1
        for (int i = 0; i < coins.length + 1; i++) {
            dp[i][0] = 1;
        }

        // if no coins present, you can never get an amount more than zero.
        // initialization is not required since it's already zero.

        for (int i = 1; i < coins.length + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (coins[i - 1] <= j) {
                    // adding # of ways in each choice
                    // include or exclude a coin
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else {
                    // coin value more than current amount, coin excluded
                    dp[i][j] = dp[i - 1][j];
                }
            }
        } 

        // last element of the diagonal has the answer
        return dp[coins.length][amount]; // int return type
    }
}
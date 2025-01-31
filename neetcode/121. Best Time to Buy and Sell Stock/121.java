/*
Method 1.0: Start with a buy price and if the buy price is more than the current buy price, update
buy with that price and find the maximum profit.
TC: O(n)
SC: O(1)
 */

class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int buy = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }

            ans = Math.max(ans, prices[i] - buy);
        }

        return ans;
    }
}

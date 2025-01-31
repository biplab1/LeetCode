/*
Method 1.0: Start with a buy price and if the buy price is more than the current buy price, update
buy with that price and find the maximum profit.
TC: O(n)
SC: O(1)
 */

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var ans = 0
        var buy = prices[0]

        for (i in prices.indices) {
            if (prices[i] < buy) {
                buy = prices[i]
            }

            ans = max(ans, prices[i] - buy)
        }

        return ans
    }
}

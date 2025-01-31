/*
Method 1.0:
Intuition: Whenever you come across a lower value stock update buy with that price and
find the maximum profit (curr price - buy).
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

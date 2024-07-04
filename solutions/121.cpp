class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int left = 0, right = 1;
        int max_profit = 0, currentProfit;
        while (right < prices.size()){
            currentProfit = prices[right] - prices[left];
            if (prices[left] < prices[right])
                max_profit = max(currentProfit, max_profit);
            else left = right;
            right += 1;
        }
        return max_profit;
    }
};
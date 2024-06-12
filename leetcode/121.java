/*
Without stack, single loop
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int maxProfit(int[] prices) {
        int profit = -1;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            profit = Math.max(profit, prices[i] - buy);
        }

        return profit != -1? profit : 0;
    }
}

/*
Using stack and single for loop

class Solution {
    public int maxProfit(int[] prices) {
        Deque<Integer> stack = new LinkedList<>();
        int profit = -1;
        int[] ngi = new int[prices.length];

        for (int i = prices.length - 1; i >= 0; i--) {
            
            while(!stack.isEmpty() && stack.peekFirst() <= prices[i]) {
                stack.pollFirst();
            }

            if (stack.isEmpty()) {
                stack.offerFirst(prices[i]);
            } else {
                profit = Math.max(profit, stack.peekFirst() - prices[i]);
            }   
        }

        return profit != - 1? profit : 0;
    }
}

*/


/*
Using stack
Intuition: Nearest greatest right

class Solution {
    public int maxProfit(int[] prices) {
        Deque<Integer> stack = new LinkedList<>();
        int profit = -1;
        int[] ngr = new int[prices.length];

        for (int i = prices.length - 1; i >= 0; i--) {
            
            while(!stack.isEmpty() && stack.peekFirst() <= prices[i]) {
                stack.pollFirst();
            }

            if (stack.isEmpty()) {
                stack.offerFirst(prices[i]);
            } else {
                ngr[i] = stack.peekFirst();
            }
            
        }

        for (int i = 0; i < prices.length; i++) {
            profit = Math.max(profit, ngr[i] - prices[i]);
        }

        return profit != - 1? profit : 0;
    }
}
*/
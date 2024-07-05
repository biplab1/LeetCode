/*
 * Method 1: 
 * TC: O(NlogN)
 */

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Arrays.sort(worker);

        PriorityQueue<Integer> minDiff = new PriorityQueue<>((a, b) -> difficulty[a] - difficulty[b]);
        PriorityQueue<Integer> maxProf = new PriorityQueue<>((a, b) -> profit[b] - profit[a]);

        int result = 0;

        for (int i = 0; i < difficulty.length; i++) {
            minDiff.offer(i);
        }

        for (int ab : worker) {
            while(!minDiff.isEmpty() && difficulty[minDiff.peek()] <= ab) {
                maxProf.offer(minDiff.poll());
            }

            if (maxProf.isEmpty()) continue;

            result += profit[maxProf.peek()];
        }

        return result;
    }
}

/*
 * Method 2: 
 * TC: O(N)
 */
/*
 * class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
       int result = 0;

       int maxDiff = 0;

       for (int d : difficulty) {
            maxDiff = Math.max(maxDiff, d);
       }

       int[] mostProfit = new int[maxDiff + 1];

       for (int i = 0; i < profit.length; i++) {
            mostProfit[difficulty[i]] = Math.max(mostProfit[difficulty[i]], profit[i]);
       }

       int currMaxProfit = 0;

       for (int i = 0; i < mostProfit.length; i++) {
            if (mostProfit[i] > currMaxProfit) {
                currMaxProfit = mostProfit[i];
            }
            mostProfit[i] = currMaxProfit;
       }

       for (int a : worker) {
            if (a > maxDiff) result += mostProfit[maxDiff];
            else 
                result += mostProfit[a];
       }

       return result;
    }
}
 */
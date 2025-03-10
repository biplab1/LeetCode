/*
Method 1.0
Intuition: Use Bellman-Ford algorithm
TC: O(N * K), N is number of cities, K (a given number)
SC: O(N), two arrays used
 */
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] currentDist = new int[n];
        int[] prevDist = new int[n];

        Arrays.fill(currentDist, Integer.MAX_VALUE/2);

        currentDist[src] = 0;

        for (int i = 0; i < k + 1; ++i) {

            System.arraycopy(currentDist, 0, prevDist, 0, n);

            for (int[] flight : flights) {

                int from = flight[0], to = flight[1], cost = flight[2];
                currentDist[to] = Math.min(currentDist[to], prevDist[from] + cost);
            }
        }

        return currentDist[dst] == Integer.MAX_VALUE/2 ? -1 : currentDist[dst];
    }
}

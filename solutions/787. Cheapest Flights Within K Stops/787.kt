/*
Method 1.0
Intuition: Use Bellman-Ford algorithm
TC: O(N * K), N is number of cities, K (a given number)
SC: O(N), two arrays used
 */
class Solution {
    fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
        val currDist = IntArray(n) {Int.MAX_VALUE/2}
        val prevDist = IntArray(n)

        currDist[src] = 0

        for (i in 0..k) {
            currDist.copyInto(prevDist)

            for (flight in flights) {
                val (from, to, cost) = flight

                currDist[to] = minOf(currDist[to], prevDist[from] + cost)
            }
        }

        return if (currDist[dst] == Int.MAX_VALUE/2) -1 else currDist[dst]
    }
}

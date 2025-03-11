/*
Method 1.0:
Intuition: use max heap to get the heaviest stones at top
Another approach: use sorted array and a pointer to keep track of heaviest stones
TC: O(N log N)
SC: O(N), number of stones
 */

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxH = new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            maxH.offer(stone);
        }

        while (maxH.size() > 1) {
            int first = maxH.poll();
            int second = maxH.poll();

            if (first != second) {
                maxH.offer(first - second);
            }
        }

        return maxH.isEmpty()? 0 : maxH.peek();
    }
}

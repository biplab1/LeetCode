/*
Method 1.0: Using minHeap
Intution: build a frequency map and add key and count pairs to a minHeap, keep only the k most
frequent numbers.
TC: O(n log k)
SC: O(n + k)
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> a[1] == b[1] ? b[0] - a[0]: a[1] - b[1]);

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            minHeap.offer(new int[]{key, map.get(key)});
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        int index = 0;

        while (!minHeap.isEmpty()) {
            int[] temp = minHeap.poll();
            result[index++] = temp[0];
        }

        return result;
    }
}

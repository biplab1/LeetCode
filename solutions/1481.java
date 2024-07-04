class Solution {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int val : map.values()) {
            minHeap.add(val);
        }

        while (!minHeap.isEmpty()) {
            k -= minHeap.peek();
            if (k < 0) return minHeap.size();
            minHeap.poll(); 
        }

        return minHeap.size();
    }
}
class Solution {
    static class Pair {
        int value;
        int freq;
        
        Pair (int value, int freq) {
            this.value = value;
            this.freq = freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(
            (a, b) -> a.freq == b.freq ? a.value - b.value : a.freq - b.freq);
        
        int[] result = new int[k];
        Map<Integer, Integer> freqs = new HashMap<>();
        
        for (int num : nums) {
            freqs.put(num, freqs.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : freqs.entrySet()) {
            minHeap.offer(new Pair(entry.getKey(), entry.getValue()));
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        int index = 0;
        
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll().value;
        }
        
        return result;
    }
}
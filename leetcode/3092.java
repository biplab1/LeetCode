class Solution {

    class Pair {
        int id;
        long freq;
        
        Pair (int id, long freq) {
            this.id = id;
            this.freq = freq;
        }
    }

    public long[] mostFrequentIDs(int[] nums, int[] freq) {
        HashMap<Integer, Long> map = new HashMap<>();

        PriorityQueue<Pair> maxQueue = new PriorityQueue<>((a,b)-> Long.compare(b.freq, a.freq));
       
        long[] result = new long[nums.length];

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0L) + freq[i]);
           
            maxQueue.add(new Pair(nums[i], map.get(nums[i])));

            while (maxQueue.peek().freq != map.get(maxQueue.peek().id)) {
                maxQueue.poll();
            }

            result[i] = maxQueue.peek().freq;
        }

        return result;
    }
}

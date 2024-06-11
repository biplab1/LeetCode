class Solution {
    class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
        @Override
        public String toString() {
            return this.value + " " + this.index;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Pair)) {
                return false;
            }
            Pair pair = (Pair) o;

            return value == pair.value && index == pair.index;
        }
    }

    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a, b) -> a.value == b.value ? a.index - b.index : a.value - b.value);

        boolean[] marked = new boolean[nums.length];
        long[] result = new long[queries.length];
        int index = 0;

        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            minHeap.add(new Pair(nums[i], i));
            sum += nums[i];
        }

        
        for (int[] query : queries) {
            int id = query[0];
            int k = query[1];
            if (!marked[id]) {
                marked[id] = true;
                Pair toRemove = new Pair(nums[id], id);
                minHeap.remove(toRemove);
                sum -= nums[id];
            } 

            while (k-- > 0 && !minHeap.isEmpty()) {
                Pair pair = minHeap.poll();
                marked[pair.index] = true;
                sum -= nums[pair.index];
            }

            result[index++] = sum;
        }

        return result;
    }
}
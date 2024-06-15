/*
Method 1: Using single Heap
*/

class Solution {

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
       int maxCap = 0;

       for (int cap : capital) {
            maxCap = Math.max(maxCap, cap);
       }

       if (w >= maxCap) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int profit : profits) {
                minHeap.offer(profit);
                if (minHeap.size() > k) minHeap.poll();
            }

            for (int profit : minHeap) {
                w += profit;
            }

            return w;
       }

       for (int i = 0; i < Math.min(k, profits.length); i++) {
            int index = -1;

            for (int j = 0; j < profits.length; j++) {
                if (w >= capital[j] && (index == -1 || profits[j] > profits[index])) {
                    index = j;
                }
            }

            if (index == -1) break;

            w += profits[index];
            capital[index] = Integer.MAX_VALUE;
       }

       return w;
    }
}


/*
Method 2: Two Heaps
*/
/*

class Solution {

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Integer> minCapHeap = new PriorityQueue<>((a, b) -> capital[a] - capital[b]);

        PriorityQueue<Integer> maxProfHeap = new PriorityQueue<>((a, b) -> profits[b] - profits[a]);
        
        for (int i = 0; i < capital.length; i++) {
            minCapHeap.offer(i);
        }

        for (int i = 0; i < k; i++) {
            while (!minCapHeap.isEmpty() && capital[minCapHeap.peek()] <= w) {
                maxProfHeap.offer(minCapHeap.poll());
            }

            if (maxProfHeap.isEmpty()) break;

            w += profits[maxProfHeap.poll()];
        }

        return w;
    }
}
*/
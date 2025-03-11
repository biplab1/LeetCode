/*
Method 1.0
Intuition: Use min heap to get rid of the marks less than Kth Largest
TC: O(N log K), where N is number of add calls
TC: O(K), where K is size of priority queue
 */

class KthLargest {

    PriorityQueue<Integer> minQ;
    int size;

    public KthLargest(int k, int[] nums) {
        minQ = new PriorityQueue<>();
        this.size = k;

        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        minQ.offer(val);

        if (minQ.size() > size) {
            minQ.poll();
        }

        return minQ.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

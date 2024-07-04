/*
Method 1: Using two heaps
TC Each Op: addNum O(log n), findMedian O(1)
*/

class MedianFinder {
    PriorityQueue<Integer> maxHeap; // first half
    PriorityQueue<Integer> minHeap; // second half
    boolean isEven; 

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
        isEven = true;
    }
    
    public void addNum(int num) {
        if (isEven) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        isEven = !isEven;
    }
    
    public double findMedian() {
        if (isEven) {
            return (minHeap.peek() + maxHeap.peek())/2.0;
        } 

        return maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
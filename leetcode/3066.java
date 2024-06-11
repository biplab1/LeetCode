class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            minHeap.add((long) num);
        }
        
        int count = 0;
        
        while (minHeap.size() >= 2) {
            if (minHeap.peek() >= k) break;
            long x = minHeap.poll();
            
            long y = minHeap.poll();
            long temp = Math.min(x, y) * 2 + Math.max(x, y);
            
            minHeap.add(temp);
            count++;
        }
        
        return count;
    }
}



/*
    Take the two smallest integers x and y in nums.
    Remove x and y from nums.
    Add min(x, y) * 2 + max(x, y) anywhere in the array.
*/
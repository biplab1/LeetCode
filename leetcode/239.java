class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        
        int i = 0;
        int j = 0;
        Deque<Integer> queue = new LinkedList<>();
        int index = 0;
        
        while (j < n) {
            while (!queue.isEmpty() && queue.peekLast() < nums[j]) {
                queue.pollLast();
            }
            
            queue.offer(nums[j]);
            
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                result[index++] = queue.peekFirst();
                if (nums[i] == queue.peekFirst()) {
                    queue.pollFirst();
                }
                i++;
                j++;
            }
        }
        
        return result;
    }
}
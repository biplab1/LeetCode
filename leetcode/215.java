class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] freqs = new int[2 * 10000 + 1];

        for (int num : nums) {
            freqs[num + 10000]++;
        }

        for (int i = freqs.length - 1; i >= 0; i--) {
            k -= freqs[i];
            if (k <= 0) {
                return i - 10000;
            }
        }

        return -1;

        
    }
}
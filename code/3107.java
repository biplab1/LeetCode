class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        long operations = 0;
        int mid = nums.length/2;

        Arrays.sort(nums);

        if (nums[mid] > k) {
            for (int i = mid; i >= 0; i--) {
                if (nums[i] > k) {
                    operations += nums[i] - k;
                }
            }
        } else if (nums[mid] < k) {
            for (int i = mid; i < nums.length; i++) {
                if (nums[i] < k) {
                    operations += k - nums[i];
                }
            }
        }
        
        return operations;
    }
}
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        long sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0 && nums[i - 1] == 0) return true;
            
            sum += nums[i];

            if (sum % k == 0) return true;

            int j = 0;
            long temp = sum;
            while (i - j > 1 && temp >= k) {
                temp -= nums[j];
                if (temp % k == 0) return true;
                j++;
            }
        }

        return false;
    }
}
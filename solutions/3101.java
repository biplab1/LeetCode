class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long count = 0;

        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[j - 1] == nums[j]) {
                int len = j - i;
                count += (long) len * (len + 1)/2;
                i = j;
            }
            j++;
        }

        int len = j - i;
        count += (long) len * (len + 1)/2;

        return count;
    }
}
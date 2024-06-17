class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (int num : nums) {
            if (num == 0) zeros++;
            if (num == 1) ones++;
            if (num == 2) twos++;
        }

        int i = 0;
        for (; i < zeros; i++) {
            nums[i] = 0;
        }
        for (; i < zeros + ones; i++) {
            nums[i] = 1;
        }

        for (; i < nums.length; i++) {
            nums[i] = 2;
        }
    }

}
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        int i = 0;

        while (i < n) {
            if (nums[i] == i + 1 || nums[i] <= 0 || nums[i] >= n) i++;
            else if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else i++;
        }

        i = 0;

        while (i < n && nums[i] == i + 1) i++;

        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
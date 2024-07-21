class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int first = helper(nums, 0, n - 2);
        int second = helper(nums, 1, n - 1);

        return Math.max(first, second);
    }

    private int helper(int[] nums, int start, int end) {
        int a = 0;
        int b = 0;

        for (int i = start; i <= end; i++) {
            int temp = Math.max(a + nums[i], b);
            a = b;
            b = temp;
        }

        return Math.max(a, b);
    }
}

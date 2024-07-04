class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 == 1) return false;
        return subsetSum(nums, sum / 2);
    }

    private boolean subsetSum(int[] arr, int suma) {
        boolean[][] t = new boolean[arr.length + 1][suma + 1];

        for (int j = 0; j < suma + 1; j++) {
            t[0][j] = false;
        }

        for (int i = 0; i < arr.length + 1; i++) {
            t[i][0] = true;
        }

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= suma; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[arr.length][suma];
    }
}
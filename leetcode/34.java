class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int leftIndex = findIndex(nums, target, true);
        if (leftIndex == -1) {
            return result; 
        }

        int rightIndex = findIndex(nums, target, false);

        result[0] = leftIndex;
        result[1] = rightIndex;

        return result;
    }

    private int findIndex(int[] nums, int target, boolean isLeft) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (isLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return index;
    }
}
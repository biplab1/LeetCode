class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums, n);

        int left = binarySearch(nums, 0, pivot - 1, target);
        int right = binarySearch(nums, pivot, n - 1, target);

        if (left != -1) return left;
        if (right != -1) return right;
        return -1;   
    }

    private int findPivot(int[] nums, int n) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (nums[start] <= nums[end]) {
                return start;
            }

            int mid = start + (end - start) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                return mid;
            } else if (nums[mid] <= nums[end]) {
                end = mid - 1;
            } else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }

    private int binarySearch(int[] arr, int start, int end, int x) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }


}
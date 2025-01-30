/*
Method 1.0: Standard Binary Search
Intuition: use two pointers left and right, find the mid and check if mid value matches, less than
or greater than target value. If mid value matches target return index, else accordingly update the
left or right pointer. If target is not found, return -1
TC: O(log N)
SC: O(1)
 */

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

/*
Method 1.0: Two pointers
TC: O(N)
SC: O(1)
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currTotal = numbers[left] + numbers[right];
            if (currTotal == target) {
                return new int[]{left + 1, right + 1};
            }

            else if (currTotal < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}

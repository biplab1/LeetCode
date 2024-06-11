class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes = 0;

        int i = 0;
        int j = 0;
        int zeros = 0;

        while (j < nums.length) {
            if (nums[j] == 0) {
                zeros++;
            }

            if (zeros <= k) {
                maxOnes = Math.max(maxOnes, j - i + 1);
            } else {
                while (zeros > k) {
                    if (nums[i] == 0) {
                        zeros--;
                    }
                    i++;
                }
            }
            j++;
        }

        return maxOnes;
    }
}
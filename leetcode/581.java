class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int[] temp = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(temp);

        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            if (temp[i] != nums[i]) {
                start = i;
                break;
            }
        }

        int end = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (temp[i] != nums[i]) {
                end = i;
                break;
            }
        }

        if (start == end) return 0;
        return end - start + 1;
    }
}
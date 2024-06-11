class Solution {
    public int maximumPrimeDifference(int[] nums) {
        Set<Integer> set = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));
        
        int maxDist = 0;
        int first = 0;
        int last = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                first = i;
                break;
            }
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(nums[i])) {
                last = i;
                break;
            }
        }
        
        return last - first;
    }
}
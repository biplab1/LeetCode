class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCnt = 0;
        int maxCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxCnt = Math.max(currCnt, maxCnt);
                currCnt = 0;
            }
            else {
                currCnt++;
            }
        }
        maxCnt = Math.max(currCnt, maxCnt);
        return maxCnt;
    }
}


//User function Template for Java

class Solution
{
    public int minimum_difference(int[] nums)
    {
        // code here
        Arrays.sort(nums);
        
        int minDiff = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length - 1; i++) {
            int currDiff = nums[i + 1] - nums[i];
            if (currDiff < minDiff) {
                minDiff = currDiff;
            }
        }
        
        return minDiff;
    }
}
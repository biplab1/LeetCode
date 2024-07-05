/*
 * Method 1: Iterative DP with 2 variables
 */

 class Solution {
    public int rob(int[] nums) {

        int robbed = 0;
        int notRobbed = 0;

        for (int num : nums) {
            int temp = robbed;
            robbed = Math.max(notRobbed + num, robbed);
            notRobbed = temp;
        }

        return robbed;
    }
}

/*
 * Method 2.0: Iterative DP (Push DP)
 */

 /*
  * class Solution {
    
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];

        dp[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max(nums[i] + dp[i - 1], dp[i]);
        }

        return dp[nums.length];
    }
}
  */

/*
  * Method 3.0: Recursive with Memoization
  */
  /*
   * class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return solve(nums, nums.length - 1);
    }

    private int solve(int[] nums, int index) {
        if (index < 0) {
            return 0;
        }

        if (dp[index] != -1) return dp[index];

        return dp[index] = Math.max(nums[index] + solve(nums, index - 2), solve(nums, index - 1));
    }
}
   */

 /*
  * Method 3.1: Recursive with Memoization
  */
  /*
   * class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length + 1];

        Arrays.fill(dp, -1);

        return solve(nums, 0);
    }

    private int solve(int[] nums, int index) {
        if (index >= nums.length) return 0;
        
        if (dp[index] != -1) return dp[index];

        return dp[index] = Math.max(nums[index] + solve(nums, index + 2), solve(nums, index + 1));
    }
}
   */

/* 
 * Method 4.0: Recursive 
 */
/*
class Solution {
    public int rob(int[] nums) {
       return solve(nums, nums.length - 1);
    }

    private int solve(int[] nums, int index) {
        if (index < 0) {
            return 0;
        }

        return Math.max(nums[index] + solve(nums, index - 2), solve(nums, index - 1));
    }
}
*/

/*
 * Method 4.1: Recursive
 */
/*
 * class Solution {
    public int rob(int[] nums) {
        return solve(nums, 0);
    }

    private int solve(int[] nums, int index) {
        if (index >= nums.length) return 0;

        return Math.max(nums[index] + solve(nums, index + 2), solve(nums, index + 1));
    }
}
 */

 
/*
Method 1
*/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing_number = n;

        for (int i = 0; i < n; i++) {
            missing_number ^= i ^ nums[i];
        }
        return missing_number;
    }
}

/*
Method 2
*/
/*
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumArr = 0;
        for (int i = 0; i < n; i++) {
            sumArr += nums[i];
        }
        int seriesSum = n * (n + 1)/2;
        return seriesSum - sumArr;
    }
}
*/
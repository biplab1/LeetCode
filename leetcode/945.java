/*
Method 1: Without sort function
TC : O(N)
SC : O(N)
*/

class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max = 0;

        for (int n : nums) {
            max = Math.max(max, n);
        }

        int[] freq = new int[nums.length + max];

        for (int n : nums) {
            freq[n]++;
        }

        int minMoves = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] < 2) continue;

            int duplicates = freq[i] - 1;

            freq[i + 1] += duplicates;
            freq[i] = 1;
            minMoves += duplicates;
        }

        return minMoves;
    }
}


/*
Method 2: Using sorting
TC: O(nlog n)
SC: O(1)
*/
/*

class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);

        int result = 0;
        int required = 0;

        for (int n : nums) {
            result += Math.max(required - n, 0);
            required = Math.max(n, required) + 1;
        }

        return result;  
    }
}
*/
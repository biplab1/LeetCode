class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        
        int minArr = Integer.MAX_VALUE;
        int[] bitCount = new int[32];
        int[] orValue = new int[1];
        
        while (j < nums.length) {
            doBitwiseOr(bitCount, orValue, nums[j]);
            
            while (orValue[0] >= k && i <= j) {
                minArr = Math.min(minArr, j - i + 1);
                undoBitwiseOr(bitCount, orValue, nums[i]);
                i++;
            }

            j++;
        }
        
        if (minArr == Integer.MAX_VALUE) return -1;
        return minArr;
    }

    private void doBitwiseOr(int[] bitCount, int[] orValue, int num) {
        orValue[0] |= num;

        for (int i = 0; i < 32; i++) {
            bitCount[i] += (num & (1 << i)) != 0 ? 1 : 0;
        }
    }

    private void undoBitwiseOr(int[] bitCount, int[] orValue, int num) {
        for (int i = 0; i < 32; i++) {
            bitCount[i] += (num & (1 << i)) != 0 ? -1 : 0;
            if (bitCount[i] == 0) {
                orValue[0] = orValue[0] & ~(1 << i);
            }
        }
    }
}
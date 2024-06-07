class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        // now xor contains xor of 3 and 5
        // get the rightmost set bit of each num, put num into two separate groups
        int[] result = new int[2];

        int mask = 1;
        while ((xor & mask) == 0) {
            mask <<= 1;
        }

        for (int num : nums) {
            if ((num & mask) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }

        return result;
    }
}
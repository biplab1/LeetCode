class Solution {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        long pairs = 0;

        int[] count1 = new int[1000_000 + 1];
        int[] count2 = new int[1000_000 + 1];

        for (int num1 : nums1) {
            count1[num1]++;
        }

        for (int num2 : nums2) {
            count2[num2]++;
        }

        for (int i = 1; i < 1000_001; i++) {
            if (count2[i] > 0) {
                for (int j = i * k; j < 1000_001; j += i * k)
                    pairs += (long) count2[i] * count1[j];
            } 
        }
        
        return pairs;
    }
}
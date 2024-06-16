class Solution {
    public long countCompleteDayPairs(int[] hours) {
        int[] freq = new int[24];
        long pairs = 0;

        for (int hour : hours) freq[hour % 24]++;

        for (int i = 1; i <= 11; i++) {
            pairs += (long) freq[i] * freq[24 - i];
        }

        pairs += (long) freq[12] * (freq[12] - 1)/2;
        pairs += (long) freq[0] * (freq[0] - 1)/2;
        
        return pairs;
    }
}
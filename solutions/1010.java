class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int n = 60;

        int[] freq = new int[n];
        long ans = 0;

        for (int t : time) freq[t % n]++;

        for (int i = 1; i < n/2; i++) {
            ans += (long) freq[i] * freq[n - i];
        }

        ans += (long) freq[n/2] * (freq[n/2] - 1)/2;
        ans += (long) freq[0] * (freq[0] - 1)/2;

        return (int) ans;
    }
}
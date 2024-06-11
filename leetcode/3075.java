class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h);

        int n = h.length;

        long sum = 0;

        int j = 0;

        for (int i = n - 1; i >= n - k; i--) {
            sum += (long) Math.max(0, h[i] - j++) ;
        }

        return sum;
    }
}
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalSeconds = 0;
        if (timeSeries.length == 0) return 0;

        for (int i = 1; i < timeSeries.length; i++) {
            int timeGap = timeSeries[i] - timeSeries[i-1];
            if (timeGap < duration) {
                totalSeconds += timeGap;
            }
            else {
                totalSeconds += duration;
            }
        }
        return totalSeconds + duration;
    }
}
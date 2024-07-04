/*
 * Method 1.0
 */

 class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int prev = 0;
        int overlaps = 0;

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= intervals[prev][1]) {
                prev = i;
            } else {
                overlaps++;
                if (intervals[prev][1] > intervals[i][1]) 
                    prev = i;
            }
        }

        return overlaps;
    }
}

/*
 * Method 1.1
 */
/* 
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int total = intervals.length;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int prev = 0;
        int nonOverlaps = 1;

        for (int i = 1; i < total; i++) {
            if (intervals[i][0] >= intervals[prev][1]) {
                nonOverlaps++;
                prev = i;
            }
        }

        return total - nonOverlaps;
    }
}
*/
/*
 * Method 1:
 */
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;
        
        int i = 0;

        while (i < n && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i++]);
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        
        list.add(newInterval);

        while (i < n) {
            list.add(intervals[i++]);
        }

        return list.toArray(new int[list.size()][]); 
    }
}

/*
 * Method 2:
 * Using sorting
 */
/*
 * class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int n = intervals.length;

        for (int[] interval : intervals) {
            list.add(interval);
        }

        list.add(newInterval);

        Collections.sort(list, (a, b) -> a[0] - b[0]);

        for (int[] y : list) {
            System.out.println(y[0] + " " + y[1]);
        }

        List<int[]> res = new ArrayList<>();
        
        res.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            int[] prev = res.get(res.size() - 1);
            int[] curr = list.get(i);

            if (prev[1] >= curr[0] && prev[1] < curr[1]) {
                res.remove(res.size() - 1);
                res.add(new int[]{prev[0], curr[1]});
            } else if (prev[1] >= curr[1]) {
                continue;
            } else {
                res.add(curr);
            }
        }

        int[][] result = new int[res.size()][2];
        int index = 0;
        
        for (int[] x : res) {
            result[index][0] = x[0];
            result[index][1] = x[1];
            index++;
        }

        return result; 
    }
}
 */
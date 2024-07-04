/*
 * Method 1.0:
 */
class Solution {

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {
            list.add(interval);
        }

        Collections.sort(list, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        List<int[]> out = new ArrayList<>();
        int start = list.get(0)[0];
        int end = list.get(0)[1];

        int i = 1;

        while (i < list.size()) {
            int[] curr = list.get(i);
            if (curr[0] <= end) {
                end = Math.max(curr[1], end);
            } else {
                out.add(new int[]{start, end});
                start = curr[0];
                end = curr[1];
            }
            i++;
        }

        out.add(new int[]{start, end});

        int[][] result = new int[out.size()][2];
        int index = 0;

        for (int[] p : out) {
            result[index][0] = p[0];
            result[index][1] = p[1];
            index++;
        }

        return result;
    }
}

/*
 * Method 1.1:
 * Using a pair
 */ 
/*
 * class Solution {

    class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int[][] merge(int[][] intervals) {
        List<Pair> list = new ArrayList<>();

        for (int[] interval : intervals) {
            list.add(new Pair(interval[0], interval[1]));
        }

        Collections.sort(list, (a, b) -> a.first != b.first ? a.first - b.first : a.second - b.second);

        int i = 1;

        List<Pair> out = new ArrayList<>();
        out.add(list.get(0));

        while (i < list.size()) {
            Pair prev = out.get(out.size() - 1);
            Pair curr = list.get(i);

            if (prev.second >= curr.first && prev.second < curr.second) {
                out.remove(out.size() - 1);
                out.add(new Pair(prev.first, curr.second));
            } else if (prev.second >= curr.second) {
                out.remove(out.size() - 1);
                out.add(new Pair(prev.first, prev.second));
            }
            else {
                out.add(curr);
            }

            i++;
        }

        int[][] result = new int[out.size()][2];
        int index = 0;

        for (Pair p : out) {
            result[index][0] = p.first;
            result[index][1] = p.second;
            index++;
        }

        return result;
    }
}
 */
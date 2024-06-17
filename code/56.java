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
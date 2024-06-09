class Solution {
    public int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i][0], i);
        }

        int[] result = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            Integer temp = map.ceilingKey(intervals[i][1]);
            result[i] = temp == null? -1 : map.get(temp);
        }

        return result;
    }
}
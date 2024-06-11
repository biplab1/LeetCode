class Solution {
    
    public int maxPointsInsideSquare(int[][] points, String s) {
        Set<Integer> seen = new HashSet<>();
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();
        
        int n = points.length;
        
        for (int i = 0; i < n; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int[] t = {x, y, s.charAt(i)};
            int dist = Math.max(Math.abs(x), Math.abs(y)) * 2;
            map.computeIfAbsent(dist, _ -> new ArrayList<>()).add(t);
        }

        int count = 0;
        
        for (var entry : map.entrySet()) {
            boolean flag = false;
            int curr = 0;
            for (int[] p : entry.getValue()) {
                if (!seen.add(p[2])) {
                    flag = true;
                } else curr++;
            }

            if (flag) return count;
            count += curr;
        }

        return count;
    }
}
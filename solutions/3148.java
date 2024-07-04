class Solution {
    public int maxScore(List<List<Integer>> grid) {
        
        // idea is to get the min element at top left of each element

        int n = grid.size();
        int m = grid.get(0).size();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int prev = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                if (i > 0) prev = Math.min(prev, grid.get(i - 1).get(j));
                if (j > 0) prev = Math.min(prev, grid.get(i).get(j - 1));
                
                int currScore = grid.get(i).get(j) - prev;

                max = Math.max(max, currScore);

                grid.get(i).set(j, Math.min(prev, grid.get(i).get(j)));
            }
        }

        return max;
    }
}
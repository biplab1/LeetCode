class Solution {
    
    public int[] queryResults(int limit, int[][] queries) {
        int[] result = new int[queries.length];
        
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> colors = new HashMap<>();
        int index = 0;
        
        for (int[] query : queries) {
            int label = query[0];
            int color = query[1];
            
            if (map.containsKey(label)) {
                int c = map.get(label);
                colors.put(c, colors.get(c) - 1);
                if (colors.get(c) == 0) colors.remove(c);
            }

            map.put(label, color);
            colors.put(color, colors.getOrDefault(color, 0) + 1);
            
            result[index++] = colors.size();
        }
        
        
        return result;
    }
}
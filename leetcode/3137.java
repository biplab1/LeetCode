class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        Map<String, Integer> map = new HashMap<>();
        int maxRep = 0;
        
        for (int i = 0; i < word.length() - k + 1; i += k) {
            String curr = word.substring(i, i + k);
            
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            if (map.get(curr) > maxRep) maxRep = map.get(curr);
        }
        
        return (word.length() / k) - maxRep;
    }
}
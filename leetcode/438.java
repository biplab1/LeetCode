class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k = p.length();
        List<Integer> result = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        int[] pMap = new int[26];
        
        for (char c : p.toCharArray()) {
            pMap[c - 'a']++;
        }
        
        int[] sMap = new int[26];
        
        while (j < s.length()) {
            sMap[s.charAt(j) - 'a']++;
            
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (Arrays.equals(pMap, sMap)) {
                    result.add(i);
                }
               
                sMap[s.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }
        
        return result;
    }
}
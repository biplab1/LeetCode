class Solution {
    public String lastNonEmptyString(String s) {
        int[] charMap = new int[26];
        
        int maxCount = 0;
        
        for (char c : s.toCharArray()) {
            maxCount = Math.max(maxCount, ++charMap[c - 'a']);
        }
        
        charMap = new int[26];
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (++charMap[c - 'a'] == maxCount) sb.append(c);
        }
        
        return new String(sb);
    }
}
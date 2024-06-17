class Solution {
    public long countSubstrings(String s, char c) {
        char[] ch = s.toCharArray();
        
        long count = 0;
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == c) {
                count += 1;
            }
        }
        
        if (count < 2) return count;
        return count * (count + 1)/2;
    }
}
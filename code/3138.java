class Solution {
    public int minAnagramLength(String s) {
       int[] ch = new int[26];

       for (char c : s.toCharArray()) {
            ch[c - 'a']++;
       }

       int common = 0;

       for (int i = 0; i < 26; i++) {
            //if (ch[i] == 0) continue;
            common = gcd(common, ch[i]);
       }

        return s.length() / common;
    
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}
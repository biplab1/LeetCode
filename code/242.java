class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        if (s.length() != t.length()) return false;

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) return false;
        }

        return true;
    }
}
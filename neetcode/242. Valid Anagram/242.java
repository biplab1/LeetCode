/*
Method 1.1:
Intuition: Compare their character frequency maps.
TC: O(N)
SC: O(1)
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sMap = new int[26];

        for (char c : s.toCharArray()) {
            sMap[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            sMap[c - 'a']--;
        }

        for (int n : sMap) {
            if (n != 0) return false;
        }

        return true;
    }
}

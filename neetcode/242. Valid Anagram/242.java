/*
Method 1.1:
Intuition: Create a character frequency map of string s and then reduce the frequency count while
parsing string t. Now, parse the frequency map again, if any character frequency count is non zero
return false. If the previous condition is not met after complete traversal return true.
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

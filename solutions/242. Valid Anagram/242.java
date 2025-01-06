/*
Method 1.0: Using single frequency array
 */
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

/*
Method 1.1: Using two frequency arrays
 */
/*
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] countS = new int[26];
        int[] countT = new int[26];

        for (char c : s.toCharArray()) {
            countS[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            countT[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (countS[i] != countT[i]) return false;
        }

        return true;
    }
}
 */

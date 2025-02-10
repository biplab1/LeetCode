/*
Method 1.0:
Intuition: If strings are unequal return false. Create a character frequency map of string s and then reduce the frequency count while
parsing string t, if any character frequency count is negative then return false.If the previous condition is not met after complete
traversal return true.
TC: O(N)
SC: O(1)
 */

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sMap = IntArray(26)

        if (s.length != t.length) return false

        for (c in s.toCharArray()) {
            sMap[c - 'a']++
        }

        for (c in t.toCharArray()) {
            if (--sMap[c - 'a'] < 0) return false
        }

        return true
    }
}

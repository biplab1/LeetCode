/*
Method 1.0:
Intuition: Compare their character counts. Edge case: unequal lengths.
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

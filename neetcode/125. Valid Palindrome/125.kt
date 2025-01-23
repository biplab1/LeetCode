/*
Method 1.0: Two pointers
TC: O(N)
SC: O(1)
 */
class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            val a = s[left]
            val b = s[right]

            if (!a.isLetterOrDigit()) {
                left++
            } else if (!b.isLetterOrDigit()) {
                right--
            } else {
                val lowerA = a.lowercaseChar()
                val lowerB = b.lowercaseChar()

                if (lowerA != lowerB) {
                    return false
                } else {
                    left++
                    right--
                }
            }
        }

        return true
    }
}

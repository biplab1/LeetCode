
/*
Method 3: Using DP
Time Complexity: O(n^2)
Space Complexity: O(n^2);
*/


/*
Method 2: Optimized
Time Complexity: O(n^2)
Space Complexity: O(1);
*/
/*
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int even = palindromeCount(s, i, i + 1);
            int odd = palindromeCount(s, i - 1, i + 1);
            count += even + odd + 1;
        }
        return count;
    }

    private int palindromeCount(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right <= s.length() - 1 && 
                s.charAt(left--) == s.charAt(right++)) count++;
        return count;
        
    }
}
*/


/*
Method 1: Brute Force
Time Complexity: O(n^3)
Space Complexity: O(1);
*/
/*
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s.substring(i, j + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
*/
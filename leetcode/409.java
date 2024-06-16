/*
Method 1.0
*/

class Solution {
    public int longestPalindrome(String s) {
        int[] counts = new int[128];

        for (char c : s.toCharArray()) {
            counts[c - 'A']++;
        }

        int odd = 0;

        for (int count : counts) {
            if (count % 2 == 1) {
                odd++;
            }
        }

        if (odd > 1) return s.length() - odd + 1;
        return s.length();
    }
}
/*
Method 1.1:
*/
/*
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int odd = 0;

        for (char key : map.keySet()) {
            if (map.get(key) % 2 == 1) {
                odd++;
            }
        }

        if (odd > 1) return s.length() - odd + 1;
        return s.length();
    }
}
*/
/*
Method 1.2:
*/
/*
class Solution {
    public int longestPalindrome(String s) {
       Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        return hasOdd ? length + 1 : length;
    }
}
*/
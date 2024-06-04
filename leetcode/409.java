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
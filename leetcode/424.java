class Solution {
    public int characterReplacement(String s, int k) {
        int[] charMap = new int[26];

        int maxLen = 0;
        int maxOccur = 0;

        int i = 0;
        int j = 0;
        
        int count = 0;
        while (j < s.length()) {
            charMap[s.charAt(j) - 'A']++;
            maxOccur = Math.max(maxOccur, charMap[s.charAt(j) - 'A']);

            if ((j - i + 1) - maxOccur <= k) {
                maxLen = Math.max(maxLen, j - i + 1);
            } else {
                while ((j - i + 1) - maxOccur > k) {
                    charMap[s.charAt(i) - 'A']--;
                    i++;
                }
            }
            j++;
        }

        return maxLen;
    }
}
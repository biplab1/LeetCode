class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        if (words == null || words.length == 0 || 
            letters == null || letters.length == 0 ||
            score == null || score.length == 0) return 0;

        int[] freq = new int[26];

        for (char c : letters) {
            freq[c - 'a']++;
        }

        return solve(words, letters, score, freq, 0);
    }

    private int solve(String[] words, char[] letters, int[] score, int[] freq, int index) {
        int max = 0;

        for (int i = index; i < words.length; i++) {
            char[] temp = words[i].toCharArray();
            boolean canBeFormed = true;
            int totalScore = 0;
            
            for (char c : temp) {
                freq[c - 'a']--;
                totalScore += score[c - 'a'];
                if (freq[c - 'a'] < 0) canBeFormed = false;
            }

            if (canBeFormed) {
                totalScore += solve(words, letters, score, freq, i + 1);
                max = Math.max(max, totalScore);
            }

            for (char c : temp) {
                freq[c - 'a']++;
            }
            
        }

        return max;
    }
}
class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];

        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            freq[i]--;
            if (equalCounts(freq)) return true;
            freq[i]++;
        }

        return false;
    }

    private boolean equalCounts(int[] freq) {
        int prevCount = 0;

        for (int currCount : freq) {
            if (currCount == 0) continue;
            if (prevCount > 0 && currCount != prevCount) return false;
            prevCount = currCount;
        }

        return true;
    }
}
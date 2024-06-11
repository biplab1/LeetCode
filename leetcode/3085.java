class Solution {
    public int minimumDeletions(String word, int k) {
        int[] chars = new int[26];

        for (char c : word.toCharArray()) {
            chars[c - 'a']++;
        }

        int minOps = word.length();

        Arrays.sort(chars);

        for (int i = 0; i < 26; i++) {
            if (chars[i] == 0) continue;
            int currOps = 0;
        
            for (int j = 0; j < 26; j++) {
                if (chars[j] == 0) continue;

                if (chars[j] < chars[i]) {
                    currOps += chars[j]; 
                } else if (chars[j] > chars[i] + k) {
                    currOps += chars[j] - chars[i] - k;
                }
            }
            minOps = Math.min(minOps, currOps);
        }

        return minOps;
    }
}
class Solution {
    public int minSteps(String s, String t) {
        int[] charS = new int[26];
        int[] charT = new int[26];

        for (char c : s.toCharArray()) {
            charS[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charT[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (charS[i] >= charT[i]) {
                charS[i] = charS[i] - charT[i];
                charT[i] = 0;
            } else {
                charT[i] = charT[i] - charS[i];
                charS[i] = 0;
            }
        }

        int remainS = 0;

        for (int num : charS) {
            remainS += num;
            System.out.println(num);
        }

        return remainS;

    }
}
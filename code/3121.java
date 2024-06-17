class Solution {
    public int numberOfSpecialChars(String word) {
        int[][] small = new int[26][2];
        int[][] caps = new int[26][2];

        for (int i = 0; i < 26; i++) {
            caps[i][1] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c >= 'a' && c <= 'z') {
                small[c - 'a'][0]++;
                small[c - 'a'][1] = i;
            } else {
                caps[c - 'A'][0]++; 
                if (caps[c - 'A'][1] == -1) {
                    caps[c - 'A'][1] = i;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (small[i][0] != 0 && caps[i][0] != 0 && small[i][1] < caps[i][1]) {
                count++;
            }
        }
        
        return count;
    }
}
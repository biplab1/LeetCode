class Solution {

    public String frequencySort(String s) {
        // '0' - 48, '9' - 57 'a' - 97, 'z' - 122
        
        char[] ch = s.toCharArray();
        int[] count = new int[123];

        for (char c : ch) {
            count[c]++;
        }

        int i = 0;

        while (i < ch.length) {
            char c = '0' - 1;
            for (int j = '0'; j < 123; j++) {
                if (count[j] > count[c]) {
                    c = (char) j;
                }
            }

            while (count[c]-- != 0) {
                ch[i++] = c;
            }
        }

        return new String(ch);
    }
}
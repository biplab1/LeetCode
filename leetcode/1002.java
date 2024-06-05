class Solution {
    public List<String> commonChars(String[] words) {
        int[] count = new int[26];
        List<String> result = new ArrayList<>();

        for (char c : words[0].toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] currCount = new int[26];

            for (char c : words[i].toCharArray()) {
                currCount[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                count[j] = Math.min(count[j], currCount[j]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (count[i]-- > 0) {
                result.add((char) (i + 'a') + "");
            }
        }

        return result;
    }
}
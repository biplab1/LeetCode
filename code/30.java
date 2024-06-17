class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> wordFreq = new HashMap<>();

        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        int wordsCount = words.length;
        int wordLength = words[0].length();

        outer:
        for (int i = 0; i <= s.length() - wordsCount * wordLength; i++) {
            Map<String, Integer> wordsVisited = new HashMap<>();
            inner:
            for (int j = 0; j < wordsCount; j++) {
                int nextWord = i + j * wordLength;

                String t = s.substring(nextWord, nextWord + wordLength);

                if (!(wordFreq.containsKey(t))) {
                    continue outer;
                }

                wordsVisited.put(t, wordsVisited.getOrDefault(t, 0) + 1);

                if (wordsVisited.get(t) > wordFreq.getOrDefault(t, 0)) {
                    continue outer;
                }

                if (j + 1 == wordsCount) {
                    result.add(i);
                }
            }
        }

        return result;
    }
}
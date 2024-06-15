class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String w = words[i];

            if (charToWord.containsKey(p)) {
                if (!charToWord.get(p).equals(w)) {
                    return false;
                }
            } else {
                if (usedWords.contains(w)) {
                    return false;
                }

                charToWord.put(p, w);
                usedWords.add(w);
            }
        }

        return true;
    }
}
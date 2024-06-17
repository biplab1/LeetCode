
class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> validWords = new ArrayList<>();

        for (String word : words) {
            if (isWordInOneRow(word, rows)) {
                validWords.add(word);
            }
        }

        return validWords.toArray(new String[0]);
    }

    private boolean isWordInOneRow(String word, String[] rows) {
        for (String row : rows) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (row.indexOf(Character.toLowerCase(c)) == -1) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                return true;
            }
        }
        return false;
    }
}

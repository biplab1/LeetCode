class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        boolean flag = false;

        for (int i = 0; i < word.length(); i++) {
            if (i == 0 && word.charAt(i) < 'a' && word.charAt(i) >= 'A') {
                flag = true;
                count++;
            } 
            else if (word.charAt(i) < 'a' && word.charAt(i) >= 'A') {
                count++;
            }
        }

        boolean allCaps = (count == word.length());
        boolean allSmall = (count == 0);
        boolean firstLetterCaps = (count == 1) && flag;

        return allCaps || allSmall || firstLetterCaps;
    }
}
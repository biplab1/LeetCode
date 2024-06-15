class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] letters = s.toCharArray();

        while (start < end) {
            if (!vowels.contains(letters[start]) && start < end) start++;
            else if (!vowels.contains(letters[end]) && start < end) end--;

            else {
                char temp = letters[start];
                letters[start] = letters[end];
                letters[end] = temp;
                
                start++;
                end--;
            }
        }

        return new String(letters);
    }
}
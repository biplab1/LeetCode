class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        int[] ch = new int[26];
        int n = words.length;

        int[] arr = new int[n];
        int index = 0;

        for (String s : words) {
            arr[index++] = s.length();

            for (char c : s.toCharArray()) {
                ch[c - 'a']++;
            }
        }

        int pairs = 0;

        for (int i = 0; i < 26; i++) {
            pairs += ch[i]/2;
        }
        
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if ((pairs -= arr[i] / 2) < 0) {
                return i;
            }
        }

        return n;
        
    }
}
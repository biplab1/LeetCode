class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        int count = 0;
        
        while (i < word.length()) {
            char curr = word.charAt(i);
            count = 0;
            while (i < word.length() && word.charAt(i) == curr && count < 9) {
                count++;
                i++;
            }
            sb.append(count).append(curr);
        }
        
        return sb.toString();
    }
}
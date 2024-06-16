class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();

        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder constructedString = new StringBuilder();

                for (int j = 0; j < len / i; j++) {
                    constructedString.append(substring);
                }

                if (constructedString.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}
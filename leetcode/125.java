/*
Using stringbuilder, without regex

*/
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder t = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                t.append(Character.toLowerCase(c));
            }
        }

        if (t.toString().equals(t.reverse().toString())) {
            return true;
        }

        return false;
    }
}

/*
Using Regex

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }

        return true;
    }
}
*/
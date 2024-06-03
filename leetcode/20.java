class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];

        int index = -1;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[++index] = c;
            } else {
                if (index == -1) return false;
                else if ((c == ')' && stack[index] == '(') ||
                    (c == '}' && stack[index] == '{') ||
                    (c == ']' && stack[index] == '[')) index--;
                else return false;
            }
        }

        return index == -1;
    }
}
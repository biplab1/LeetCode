class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                else {
                    if ((c == ')' && stack.peek() == '(') ||
                            (c == '}' && stack.peek() == '{') ||
                            (c == ']' && stack.peek() == '['))
                    {
                        stack.pop();
                    }
                    else return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

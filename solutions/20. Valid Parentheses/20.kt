class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (c in s) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c)
            } else {
                if (stack.isEmpty()) return false
                else {
                    if ((c == ')' && stack.peek() == '(') ||
                        (c == '}' && stack.peek() == '{') ||
                        (c == ']' && stack.peek() == '[')) {
                        stack.pop()
                    }
                    else return false
                }
            }
        }

        return stack.isEmpty()
    }
}

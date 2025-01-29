class Solution {
    fun isValid(s: String): Boolean {
        val arr = CharArray(s.length)

        var top = -1

        for (c in s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                arr[++top] = c
            } else {
                if (top == -1) return false

                if ((c == ')' && arr[top] == '(') ||
                    (c == '}' && arr[top] == '{') ||
                    (c == ']' && arr[top] == '[')) {
                    top--
                }
                else return false
            }
        }

        return top == -1
    }
}

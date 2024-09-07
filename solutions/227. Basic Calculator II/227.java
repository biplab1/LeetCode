/*
Method 1:
 */
class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        Deque<Integer> stack = new LinkedList<>();
        int result = 0;

        int currNum = 0;
        char currOpt = '+';

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            if (Character.isDigit(currChar)) {
                currNum = (currNum * 10) + (currChar - '0');
            }
            if (!Character.isDigit(currChar) && currChar != ' ' || i == s.length() - 1) {
                if (currOpt == '-') {
                    stack.push(-currNum);
                } else if (currOpt == '+') {
                    stack.push(currNum);
                } else if (currOpt == '*') {
                    stack.push(stack.pop() * currNum);
                } else if (currOpt == '/') {
                    stack.push(stack.pop() / currNum);
                }
                currOpt = currChar;
                currNum = 0;
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}

/*
Method 2:
 */
/*
class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        Deque<Integer> stack = new LinkedList<>();
        int result = 0;

        int currNum = 0;
        char currOpt = '+';

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            if (Character.isDigit(currChar)) {
                currNum = (currNum * 10) + (currChar - '0');
            }
            // can use !Character.isWhitespace(currChar) inplace of currChar != ' '
            if (!Character.isDigit(currChar) && currChar != ' ' || i == s.length() - 1) {
                if (currOpt == '-') {
                    stack.push(-currNum);
                } else if (currOpt == '+') {
                    stack.push(currNum);
                } else if (currOpt == '*') {
                    stack.push(stack.pop() * currNum);
                } else if (currOpt == '/') {
                    stack.push(stack.pop() / currNum);
                }
                currOpt = currChar;
                currNum = 0;
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
 */

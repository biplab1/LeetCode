/*
 * Method 1:
 * Using array as a stack
 */
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

/*
 * Method 2:
 * Using only stack
 */
/*
 * class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
 */


/*
 * Method 3:
 * Using map, set, stack
 */
/*
 * class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        Set<Character> opening = new HashSet<>(List.of('(', '{', '['));
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : s.toCharArray()) {
            if (opening.contains(c))
                stack.addFirst(Character.valueOf(c));
            else if (stack.isEmpty() || map.containsKey(c) && map.get(c) != stack.removeFirst()) {
                return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        } 

        return false;
    }
}
 */
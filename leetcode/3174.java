class Solution {
    public String clearDigits(String s) {
        
        Deque<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.offerFirst(c);
            } else if (!stack.isEmpty() && Character.isDigit(c)) {
                stack.pollFirst();
            }
        }

        StringBuilder sb = new StringBuilder();

        while(stack.size() != 0) {
            sb.append(stack.pollFirst());
        }

        return sb.reverse().toString();
    }
}
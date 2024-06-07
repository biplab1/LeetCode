class Solution {

    public List<Integer> diffWaysToCompute(String expression) {
        char[] ch = expression.toCharArray();

        return solve(ch);
    }

    private List<Integer> solve(char[] ch) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*') {
                List<Integer> left = solve(Arrays.copyOfRange(ch, 0, i));
                List<Integer> right = solve(Arrays.copyOfRange(ch, i + 1, ch.length));

                for (int num1 : left) {
                    for (int num2 : right) {
                        if (ch[i] == '+') result.add(num1 + num2);
                        else if (ch[i] == '-') result.add(num1 - num2);
                        else if (ch[i] == '*') result.add(num1 * num2);
                    }
                }
            }
        }

        if (result.size() == 0) result.add(Integer.parseInt(String.valueOf(ch)));

        return result;
    }

    private boolean contains(char[] ch, char t) {
        for (char c : ch) {
            if (c == t) return true;
        } 

        return false;
    }
}
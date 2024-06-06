class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        Set<String> operators = new HashSet<>(Arrays.asList("+", "/", "*", "-"));
       
        for (String s : tokens) {
            if (operators.contains(s)) {
                String op2 = stack.pop();
                String op1 = stack.pop();
                stack.push(operate(op1, s, op2));
            } else {
                stack.push(s);
            }
        }

        return Integer.parseInt(stack.pop());
    }

    private String operate(String op1, String operator, String op2) {
        int temp1 = Integer.parseInt(op1);
        int temp2 = Integer. parseInt(op2);
        String result = "";

        switch(operator) {
            case "+": result = String.valueOf(temp1 + temp2);
            break;
            case "-": result = String.valueOf(temp1 - temp2);
            break;
            case "*": result = String.valueOf(temp1 * temp2);
            break;
            case "/": result = String.valueOf(temp1 / temp2);
            break;
        }

        return result;
    }
}
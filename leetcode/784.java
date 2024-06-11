class Solution {
    List<String> result = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        
        solve(s, "");
        return result;
    }

    private void solve(String ip, String op) {
        if (ip.length() == 0) {
            result.add(op);
            return;
        }

        char c = ip.charAt(0);
        String op1 = op + c;

        ip = ip.substring(1);
        solve(ip, op1);

        if (!(c >= '0' && c <= '9')) {
            char toggleCase = (char) (c ^ 32);
            String op2 = op + toggleCase;
            solve(ip, op2);
        }
        
    }
}
class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String output = "";
        solve(output, n, n);
        return result;
    }

    private void solve(String output, int open, int close) {
        if (open == 0 && close == 0) {
            result.add(output);
            return;
        }
        
        if (open > 0) {
            String output1 = output + "(";
            solve(output1, open - 1, close);
        }
        
        if (open < close) {
            String output2 = output + ")";
            solve(output2, open, close - 1);
        }
    }
}



    
   
    
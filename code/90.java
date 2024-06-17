class Solution {
    Set<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> input = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        for (int num : nums) {
            input.add(num);
        }
        
        solve(input, output);
        List<List<Integer>> out = new ArrayList<>(result);
        
        return out;
    }
        
    private void solve(List<Integer> input, List<Integer> output) {
        if (input.isEmpty()) {
            Collections.sort(output);
            result.add(output);
            return;
        }
        
        List<Integer> output1 = new ArrayList<>(output);
        List<Integer> output2 = new ArrayList<>(output);
        
        output2.add(input.get(0));
        input.remove(0);
        
        List<Integer> input1 = new ArrayList<>(input);
        List<Integer> input2 = new ArrayList<>(input);
        
        solve(input1, output1);
        solve(input2, output2);
    }
}
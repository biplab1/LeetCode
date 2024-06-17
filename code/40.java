class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates, target, 0, new ArrayList<>());
        return result;
    }

    private void solve(int[] candidates, int target, int index, List<Integer> curr) {

        if (target == 0) {
            result.add(new ArrayList<>(curr));
        }
    
        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i - 1] == candidates[i]) continue;
            if (target < candidates[i]) break;
            curr.add(candidates[i]);
            solve(candidates, target - candidates[i], i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}
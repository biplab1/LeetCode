class Solution {
    List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
    
        solve(nums, new ArrayList<>());
        
        return result;
    }

    private void solve(int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                solve(nums, temp);
                temp.remove(temp.size() - 1);
            }
        } 
    }
}
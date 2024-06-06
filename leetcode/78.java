class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> out = new ArrayList<>();

        solve(nums, 0, out);

        return result;
    }

    private void solve(int[] nums, int index, List<Integer> out) {
        if (index == nums.length) {
            result.add(out);
            return;
        }

        List<Integer> out1 = new ArrayList<>(out);
        List<Integer> out2 = new ArrayList<>(out);

        out2.add(nums[index]);

        solve(nums, index + 1, out1);
        solve(nums, index + 1, out2);
    }
}
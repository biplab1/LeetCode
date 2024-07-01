/*
 * Method 1.0:
 */
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

/*
 * Method 1.1:
 */
/*
 * class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ip = new ArrayList<>();

        for (int num : nums) {
            ip.add(num);
        }

        List<Integer> op = new ArrayList<>();
        solve(ip, op);
        return result;
    }

    private void solve(List<Integer> ip, List<Integer> op) {
        if (ip.size() == 0) {
            result.add(op);
            return;
        }

        List<Integer> op1 = new ArrayList<>(op);
        List<Integer> op2 = new ArrayList<>(op);

        op2.add(ip.get(0));
        ip.remove(0);
        List<Integer> ip1 = new ArrayList<>(ip);
        List<Integer> ip2 = new ArrayList<>(ip1);

        solve(ip1, op1);
        solve(ip2, op2);
    }
}
 */
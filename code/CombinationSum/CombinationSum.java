/*
 * Method 1.0:
 */

class Solution {
    List<List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        solve(candidates, 0, target, new ArrayList<>());
        return result;
    }

    private void solve(int[] candidates, int index, int target, List<Integer> curr) {
        if (index == candidates.length) {
            if (target == 0) {
                result.add(new ArrayList<>(curr));
            }
            return;
        }

        if (candidates[index] <= target) {
            curr.add(candidates[index]);
            solve(candidates, index, target - candidates[index], curr);
            curr.remove(curr.size() - 1);
        }

        solve(candidates, index + 1, target, curr);
    }
}

/*
Method 1.1: 

class Solution {
    List<List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();

        solve(candidates, 0, target, new ArrayList<>());

        return result;
    }

    private void solve(int[] candidates, int start, int target, List<Integer> curr) {
        if (start == candidates.length || target < 0) return;

        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            curr.add(candidates[i]);
            solve(candidates, i, target - candidates[i], curr);
            curr.remove(curr.size() - 1);
        }
    }
}

*/
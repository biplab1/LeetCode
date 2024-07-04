/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> result;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        result = new ArrayList<>();

        dfs(root, targetSum, 0, new ArrayList<>());
        return result;
    }

    private void dfs(TreeNode node, int sum, int currSum, List<Integer> currList) {
        if (node == null) return;
        
        currList.add(node.val);
        currSum += node.val;

        if (node.left == null && node.right == null && currSum == sum) {
            result.add(new ArrayList<>(currList));
        }
        
        dfs(node.left, sum, currSum, currList);
        dfs(node.right, sum, currSum, currList);
        
        currSum -= currList.get(currList.size() - 1);
        currList.remove(currList.size() - 1);
    }
}
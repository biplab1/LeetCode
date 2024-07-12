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
    int total = 0; // to use static int, use System.gc() below

    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return total;
    }

    private void dfs(TreeNode node, int currSum) {
        if (node == null) return;

        currSum = 10 * currSum + node.val;

        if (node.left == null && node.right == null) {
            total += currSum;
            return;
        }

        dfs(node.left, currSum);
        dfs(node.right, currSum);
    }
}

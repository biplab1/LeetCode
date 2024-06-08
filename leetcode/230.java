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
    public int kthSmallest(TreeNode root, int k) {
        int[] count = new int[2];
        
        dfs(root, count, k);
        return count[1];
    }

    private void dfs(TreeNode node, int[] count, int k) {
        if (node == null) return;

        dfs(node.left, count, k);
        count[0]++;
        if (count[0] == k) {
            count[1] = node.val;
            return;
        }
        dfs(node.right, count, k);
    }
}
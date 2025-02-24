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
    boolean ans;
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);

    }

    private int findHeight(TreeNode node) {
        if (node == null) return 0;

        int left = findHeight(node.left);
        int right = findHeight(node.right);

        return 1 + Math.max(left, right);
    }
}

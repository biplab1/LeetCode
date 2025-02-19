/*
Method 1.0:
Intuition: Use DFS, get left and right subtree heights to calculate curr diameter,
update diameter with max value. DFS returns the height of the subtree with the curr node
as its root.
TC: O(N), visiting N nodes
SC: O(log N), recursion stack space
 */
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
    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        findHeight(root);
        return diameter;
    }

    private int findHeight(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}

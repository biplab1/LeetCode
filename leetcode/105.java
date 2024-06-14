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
    int i = 0;
    int p = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder, inorder, -3001);
    }

    private TreeNode solve(int[] preorder, int[] inorder, int end) {
        if (p >= preorder.length) return null;

        if (inorder[i] == end) {
            i++;
            return null;
        }

        TreeNode node = new TreeNode(preorder[p]);
        p++;

        node.left = solve(preorder, inorder, node.val);
        node.right = solve(preorder, inorder, end);

        return node;
    }
}
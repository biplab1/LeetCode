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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        } 
        if (root.left == null & root.right == null) {
            return 0;
        }
        int sumLeftLeaves = 0;
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            if (size > 0) {
                TreeNode temp = q.poll();
                if (temp.left != null) {
                    q.add(temp.left);
                    if (temp.left.left == null && temp.left.right == null)
                        sumLeftLeaves += temp.left.val;
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }

            }
        }
        return sumLeftLeaves;
    }
}
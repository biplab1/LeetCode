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
    private List<Integer> preOrderTraversal(TreeNode node, List<Integer> preOrder) {
        if (node == null) {
            return preOrder;
        }
        preOrder.add(node.val);
        preOrderTraversal(node.left, preOrder);
        preOrderTraversal(node.right, preOrder);
        return preOrder;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        preOrder = preOrderTraversal(root, preOrder);
        return preOrder;
    }
}
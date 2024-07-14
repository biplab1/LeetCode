/*
Method 1.0:
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        if (root == null) {
            return postOrder;
        }
        postOrder.addAll(postorderTraversal(root.left));
        postOrder.addAll(postorderTraversal(root.right));
        postOrder.add(root.val);
        return postOrder;
    }
}

/*
Method 1.1:
 */
 /*
class Solution {
    private void postOrderTraversal(TreeNode node, List<Integer> postOrder) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left, postOrder);
        postOrderTraversal(node.right, postOrder);
        postOrder.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrder = new ArrayList<>();
        postOrderTraversal(root, postOrder);
        return postOrder;
    }
}
*/


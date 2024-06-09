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
    int count = 0;
    
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        dfsForEachNode(root, targetSum, 0);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count;
    }

    private void dfsForEachNode(TreeNode node, int targetSum, long currSum) {
        if (node == null) return;

        currSum += node.val;

        if (currSum == (long) targetSum) {
            count++;
        }

        dfsForEachNode(node.left, targetSum, currSum);
        dfsForEachNode(node.right, targetSum, currSum);
    }
}
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> pathToLeaves = new ArrayList<>();
        traverse(root, new StringBuilder(), pathToLeaves);
        return pathToLeaves;
    }

    private void traverse(TreeNode node, StringBuilder sb, List<String> path) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            path.add(sb.append(node.val).toString());
            return;        
        }
        int length = sb.length();
        traverse(node.left, sb.append(node.val).append("->"), path);
        sb.setLength(length);
        traverse(node.right, sb.append(node.val).append("->"), path);
        sb.setLength(length);
    }
}
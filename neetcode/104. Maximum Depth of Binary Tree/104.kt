/*
Method 1.0:
Intution: Base condition: root == null, depth = 0. Get the max of heights of left and right
subtrees and add 1 (root node)
TC: O(N), where N is no. of nodes, all nodes are traversed
SC: O(log N), recursive calls stack size
 */
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0

        return max(maxDepth(root.left), maxDepth(root.right)) + 1
    }
}

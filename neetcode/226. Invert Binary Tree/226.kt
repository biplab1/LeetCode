/*
Method 1.0:
Intuition: Attach the inverted subtrees to opposite sides of root node
TC: O(N), N is the number of nodes in the tree
SC: O(1)
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
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }

        val left = root.left
        val right = root.right

        root.left = invertTree(right)
        root.right = invertTree(left)

        return root
    }
}

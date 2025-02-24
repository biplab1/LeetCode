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
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true

        val leftHeight = findHeight(root.left)
        val rightHeight = findHeight(root.right)

        if (abs(leftHeight - rightHeight) > 1) return false

        return isBalanced(root.left) && isBalanced(root.right)
    }

    fun findHeight(node: TreeNode?): Int {
        if (node == null) return 0

        val leftHeight = findHeight(node.left)
        val rightHeight = findHeight(node.right)

        return 1 + max(leftHeight, rightHeight)
    }
}

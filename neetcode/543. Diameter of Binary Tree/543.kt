/*
Method 1.0:
Intuition: Use DFS, get left and right subtree heights to calculate curr diameter,
update diameter with max value. DFS returns the height of the subtree with the curr node
as its root.
TC: O(N), visiting N nodes
SC: O(log N), recursion stack space
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
    var diameter: Int = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        findHeight(root)
        return diameter
    }

    fun findHeight(root: TreeNode?): Int {
        if (root == null) return 0

        val leftHeight = findHeight(root.left)
        val rightHeight = findHeight(root.right)

        diameter = max(diameter, leftHeight + rightHeight)

        return 1 + max(leftHeight, rightHeight)
    }
}

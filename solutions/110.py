# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        if root is None:
            return True
        lh = self.height(root.left)
        rh = self.height(root.right)
        if abs(lh - rh) > 1:
            return False
        return self.isBalanced(root.left) and self.isBalanced(root.right)

    def height(self, node: Optional[TreeNode]) -> bool:
        if node is None:
            return 0
        lh = self.height(node.left)
        rh = self.height(node.right)
        return max(lh, rh) + 1
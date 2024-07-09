# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        q = deque()
        q.append(root)
        depth = 0
        while q:
            sz = len(q)
            for i in range(sz):
                temp = q.popleft()
                if temp.left:
                    q.append(temp.left)
                if temp.right:
                    q.append(temp.right)
            depth += 1
        return depth


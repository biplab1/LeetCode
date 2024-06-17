# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        depth = 1
        q = deque()
        q.append(root)
        while q:
            size = len(q)
            while (size > 0):
                temp = q.popleft()
                if (not temp.left and not temp.right):
                    return depth
                if  temp.left:
                    q.append(temp.left)
                if  temp.right:
                    q.append(temp.right)
                size -= 1
            depth += 1
        return depth
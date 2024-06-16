# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findMode(self, root: Optional[TreeNode]) -> List[int]:
        if (root == None):
            return None
        q = deque()
        q.append(root)
        freq = {}
        while q:
            size = len(q)
            while (size > 0):
                temp = q.popleft()
                if temp.val not in freq.keys():
                    freq[temp.val] = 1
                else:
                    freq[temp.val] += 1
                if temp.left:
                    q.append(temp.left)
                if temp.right:
                    q.append(temp.right)
                size -= 1
                
        maxValue = max(freq.values())
        return [key for key, value in freq.items() if maxValue == value]

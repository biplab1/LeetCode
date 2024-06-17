# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        pathToLeaves = []
        
        def traverse(node, paths):
            if node == None:
                paths.append(None)
                return
            paths.append(node.val)
            if (node.left == None and node.right == None):
                pathToLeaves.append(paths.copy())
                return
            traverse(node.left, paths)
            paths.pop()
            traverse(node.right, paths)
            paths.pop()

        traverse(root, [])
        all_paths = []
        for p in pathToLeaves:
            p = map(str, p)
            all_paths.append("->".join(p))
        return all_paths
        
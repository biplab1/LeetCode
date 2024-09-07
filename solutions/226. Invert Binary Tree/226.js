// Method 1: Recursive, DFS
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var invertTree = function(root) {
    if (root == null) return null;

    let left = root.left;
    let right = root.right;

    root.left = invertTree(right);
    root.right = invertTree(left);

    return root;
};

// Method 2: Iterative using Queue, BFS
/*
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
 /*
var invertTree = function(root) {
    let queue = [root];

    while (queue[0]) {
        let node = queue.shift();
        let left = node.left;
        node.left = node.right;
        node.right = left;

        if (node.left) {
            queue.push(node.left);
        }
        if (node.right) {
            queue.push(node.right);
        }
    }

    return root;
};
*/

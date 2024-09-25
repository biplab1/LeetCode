/*
Method 1: Inorder traversal, SC: O(n)
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] count = new int[2];

        dfs(root, count, k);
        return count[1];
    }

    private void dfs(TreeNode node, int[] count, int k) {
        if (node == null) return;

        dfs(node.left, count, k);
        count[0]++;
        if (count[0] == k) {
            count[1] = node.val;
            return;
        }
        dfs(node.right, count, k);
    }
}

/*
Method 2.0: Using list, inorder traversal
 */
/*
class Solution {
    List<Integer> list;

    public int kthSmallest(TreeNode root, int k) {
        list = new ArrayList<>();
        dfs(root);
        return list.get(k - 1);
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        // if (list.size() > k) return; // reduces the runtime
        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }
}
 */

/*
Method 3: Using minHeap, inorder traversal
 */
/*
class Solution {
    PriorityQueue<Integer> maxHeap;

    public int kthSmallest(TreeNode root, int k) {
        maxHeap = new PriorityQueue<>((a, b) -> b - a);

        dfs(root, k);
        return maxHeap.poll();
    }

    private void dfs(TreeNode node, int k) {
        if (node == null) return;

        dfs(node.left, k);
        maxHeap.offer(node.val);
        if (maxHeap.size() > k) maxHeap.poll();
        dfs(node.right, k);
    }
}
 */

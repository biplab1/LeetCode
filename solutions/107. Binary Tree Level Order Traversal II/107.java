/*
Method 1: DFS
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
    List<List<Integer>> result;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        result = new ArrayList<>();

        dfs(root, 0);

        Collections.reverse(result);
        return result;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;

        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(node.val);

        if (node.left != null) {
            dfs(node.left, level + 1);
        }

        if (node.right != null) {
            dfs(node.right, level + 1);
        }
    }
}

/*
Method 2: BFS
 */
/*
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
/*
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offerLast(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < level; i++) {
                TreeNode node = queue.peek();
                if (node.left != null) queue.offerLast(node.left);
                if (node.right != null) queue.offerLast(node.right);
                temp.add(queue.pollFirst().val);
            }
            result.add(0, temp); // result.add(temp);
        }
        // Collections.sort(result);
        return result;
    }
}
*/

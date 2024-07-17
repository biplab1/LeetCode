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
    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return result;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;

        if (result.size() == level) result.add(node.val);

        dfs(node.right, level + 1);
        dfs(node.left, level + 1);
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null) return result;

        queue.offerLast(root);

        while (!queue.isEmpty()) {
            int level = queue.size();

            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < level; i++) {
                TreeNode node = queue.pollFirst();
                temp.add(node.val);

                if (node.left != null) queue.offerLast(node.left);
                if (node.right != null) queue.offerLast(node.right);
            }

            Collections.reverse(temp);
            result.add(temp.get(0));
        }

        return result;
    }
}
 */

/*
Method 2.1: BFS
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
/*
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null) return result;

        queue.offerLast(root);

        while (!queue.isEmpty()) {
            int level = queue.size();

            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();

                if (i == level - 1) result.add(node.val);

                if (node.left != null) queue.offerLast(node.left);
                if (node.right != null) queue.offerLast(node.right);
            }
        }

        return result;
    }
}
*/

/*
Method 2.2: BFS
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
/*
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null) return result;

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

            Collections.reverse(temp);
            result.add(temp.get(0));
        }

        return result;
    }
}
*/

/*
Method 1: DFS (Recursive)
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        result = new ArrayList<>();
        dfs(root, 0);
        return result;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;

        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        if (level % 2 == 0) {
            result.get(level).add(node.val);
        } else {
            result.get(level).add(0, node.val);
        }

        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}

/*
Method 2: DFS (Recursive)
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
    List<List<Integer>> result;

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        result = new ArrayList<>();
        dfs(root, 0);
        return result;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;

        if (result.size() == level) {
            result.add(new ArrayList<>());
        }

        if (level % 2 == 0) {
            result.get(level).add(node.val);
        } else {
            result.get(level).add(0, node.val);
        }

        if (node.left != null) {
            dfs(node.left, level + 1);
        }

        if (node.right != null) {
            dfs(node.right, level + 1);
        }

    }
}
*/


/*
Method 3.0: BFS
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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null) return result;

        queue.offerLast(root);
        int count = 0;

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < level; i++) {
                TreeNode node = queue.peek();
                if (node.left != null) queue.offerLast(node.left);
                if (node.right != null) queue.offerLast(node.right);
                temp.add(queue.pollFirst().val);
            }
            if (count % 2 == 1) Collections.reverse(temp);

            count++;
            result.add(temp);
        }

        return result;
    }
}
 */


/*
Method 3.1: BFS
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
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Deque<TreeNode> queue = new LinkedList<>();

        if (root == null) return result;

        queue.offerLast(root);
        int count = 0;

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> temp = new ArrayList<>();

            if (count % 2 == 0) {
                for (int i = 0; i < level; i++) {
                    TreeNode node = queue.peek();
                    if (node.left != null) queue.offerLast(node.left);
                    if (node.right != null) queue.offerLast(node.right);
                    temp.add(queue.pollFirst().val);
                }
            } else {
                for (int i = 0; i < level; i++) {
                    TreeNode node = queue.peek();
                    if (node.left != null) queue.offerLast(node.left);
                    if (node.right != null) queue.offerLast(node.right);
                    temp.add(0, queue.pollFirst().val);
                }
            }
            count++;
            result.add(temp);
        }

        return result;
    }
}
 */

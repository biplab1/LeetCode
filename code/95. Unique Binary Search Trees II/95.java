/*
 * Method 1.0:
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

    public List<TreeNode> generateTrees(int n) {
       return solve(1, n);
    }

    private List<TreeNode> solve(int i, int j) {
        List<TreeNode> result = new ArrayList<>();

        if (i > j) {
            result.add(null);
            return result;
        }

        for (int k = i; k <= j; k++) {
            List<TreeNode> left = solve(i, k - 1);
            List<TreeNode> right = solve(k + 1, j);

            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode temp = new TreeNode(k);
                    temp.left = l;
                    temp.right = r;
                    result.add(temp);
                }
            }
        }

        return result;
    }
}

/*
 * Method 1.0:
 */
/*
 * /**
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
    List<TreeNode>[][] dp;

    public List<TreeNode> generateTrees(int n) {
        dp = new ArrayList[n + 1][n + 1];
        return solve(1, n);
    }

    private List<TreeNode> solve(int i, int j) {
        List<TreeNode> result = new ArrayList<>();

        if (i > j) {
            result.add(null);
            return result;
        }

        if (dp[i][j] != null) return dp[i][j];

        for (int k = i; k <= j; k++) {
            List<TreeNode> left = solve(i, k - 1);
            List<TreeNode> right = solve(k + 1, j);

            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    result.add(new TreeNode(k, l, r));
                }
            }
        }

        return dp[i][j] = result;
    }
}
 */

/*
Method 1:
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


public class Solution {
    private List<Integer> modes = new ArrayList<>();
    private int currentCount = 0;
    private int maxCount = 0;
    private int currentVal = 0;

    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);

        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;
    }

    public void helper(int val) {
        if (val == currentVal) {
            currentCount++;
        } else {
            currentCount = 1;
            currentVal = val;
        }

        if (currentCount > maxCount) {
            maxCount = currentCount;
            modes.clear();
            modes.add(val);
        } else if (currentCount == maxCount) {
            modes.add(val);
        }
    }

    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        helper(root.val);
        inOrderTraversal(root.right);
    }
}
/*
Method 2:
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
public class Solution {
    private List<Integer> modes = new ArrayList<>();
    private int currentVal = Integer.MIN_VALUE;
    private int currentCount = 0;
    private int maxCount = Integer.MIN_VALUE;

    public int[] findMode(TreeNode root) {
        findModes(root);
        if (currentCount >= maxCount) {
            if (currentCount > maxCount) {
                modes.clear();
            }
            modes.add(currentVal);
            maxCount = currentCount;
        }
        int[] result = new int[modes.size()];
        int index = 0;
        for (int mode : modes) {
            result[index++] = mode;
        }
        return result;
    }

    private void findModes(TreeNode root) {
        if (root == null)
            return;
        findModes(root.left);
        if (root.val == currentVal) {
            currentCount++;
        } else {
            if (currentCount >= maxCount) {
                if (currentCount > maxCount) {
                    modes.clear();
                }
                modes.add(currentVal);
                maxCount = currentCount;
            }
            currentCount = 1;
            currentVal = root.val;
        }
        findModes(root.right);
    }
}
*/
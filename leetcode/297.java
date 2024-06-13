/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        
        Deque<TreeNode> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
    
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node == null) {
                    sb.append("n ");
                }
                else {
                    sb.append(node.val + " ");
                    queue.offer(node.left);
                    queue.offer(node.right);
                } 
            }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == "") return null;
        Deque<TreeNode> queue = new LinkedList<>();

        String[] datum = data.split(" ");
        
        TreeNode root = new TreeNode(Integer.parseInt(datum[0]));
        queue.offer(root);

        for (int i = 1; i < datum.length; i++) {
            TreeNode node = queue.poll();

            if (!datum[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(datum[i]));
                node.left = left;
                queue.offer(left);
            } 
            i++;

            if (!datum[i].equals("n")) {
                TreeNode right = new TreeNode(Integer.parseInt(datum[i]));
                node.right = right;
                queue.offer(right);
            }
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
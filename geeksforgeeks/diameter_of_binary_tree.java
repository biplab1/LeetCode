/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/

class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        int[] result = new int[]{0};
        solve(root, result);
        
        return result[0];
    }
    
    int solve(Node node, int[] result) {
        if (node == null) {
            return 0;
        }
        
        int left = solve(node.left, result);
        int right = solve(node.right, result);
        
        int temp = 1 + Math.max(left, right);
        int ans = Math.max(temp, 1 + left + right);
        result[0] = Math.max(result[0], ans);
        
        return temp;
    }
}
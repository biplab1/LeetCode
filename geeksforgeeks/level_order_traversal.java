

//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        Deque<Node> queue = new LinkedList<>();
        
        ArrayList<Integer> result = new ArrayList<>();
        
        queue.offerLast(root);
        
        while(!queue.isEmpty()) {
        
            Node node = queue.pollFirst();
            result.add(node.data);
            
            if (node.left != null) {
                queue.offerLast(node.left);
            }
            if (node.right != null) {
                queue.offerLast(node.right);
            }
        }
        
        return result;
    }
}





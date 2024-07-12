/*
Method 1.0:
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        return solve(node);
    }

    private Node solve(Node node) {
        if (map.containsKey(node)) return map.get(node);

        Node newNode = new Node(node.val);

        map.put(node, newNode);

        for (Node n : node.neighbors) {
            newNode.neighbors.add(solve(n));
        }

        return newNode;
    }
}

/*
Method 1.1:
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
/*
class Solution {
    Map<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        return solve(node);
    }

    private Node solve(Node node) {
        if (map.containsKey(node.val)) return map.get(node.val);

        Node newNode = new Node(node.val);

        map.put(newNode.val, newNode);

        for (Node neighbor : node.neighbors) {
            newNode.neighbors.add(solve(neighbor));
        }

        return newNode;
    }
}
 */


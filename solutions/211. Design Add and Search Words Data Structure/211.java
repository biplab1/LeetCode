class Node {
    boolean wordEnd;
    Node[] children;

    public Node() {
        children = new Node[26];
    }
}

class WordDictionary {
    private Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node node = root;

        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new Node();
            }
            node = node.children[c - 'a'];
        }

        node.wordEnd = true;
    }

    public boolean search(String word) {
        return solve(word, root);
    }

    private boolean solve(String word, Node node) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (Node ch : node.children) {
                    if (ch != null && solve(word.substring(i + 1), ch)) return true;
                }
                return false;
            } else {
                if (node.children[c - 'a'] == null) return false;
                node = node.children[c - 'a'];
            }
        }
        return node.wordEnd;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

class TrieNode {
    public char val;
    public boolean wordEnd;

    public TrieNode[] childNodes = new TrieNode[26];
    public TrieNode() {}

    TrieNode(char c) {
        TrieNode node = new TrieNode();
        node.val = c;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }
    
    public void insert(String word) {
        TrieNode current = root;

        for (char c : word.toCharArray()) {
            if (current.childNodes[c - 'a'] == null) {
                current.childNodes[c - 'a'] = new TrieNode(c);
            }
            current = current.childNodes[c - 'a'];
        }
        current.wordEnd = true;
    }
    
    public boolean search(String word) {
       TrieNode current = root;

       for (char c : word.toCharArray()) {
            if (current.childNodes[c - 'a'] == null) {
                return false;
            }
            current = current.childNodes[c - 'a'];
       } 

       return current.wordEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current = root;

        for (char c : prefix.toCharArray()) {
            if (current.childNodes[c - 'a'] == null) {
                return false;
            }

            current = current.childNodes[c - 'a'];
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
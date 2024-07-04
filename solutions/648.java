class Solution {
    class Node {
        boolean wordEnd;
        Node[] ch;

        public Node () {
            ch = new Node[26];
        }
    }

    class Trie {
        private Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String s) {
            Node node = root;

            for (char c : s.toCharArray()) {
                if (node.ch[c - 'a'] == null) {
                    node.ch[c - 'a'] = new Node();
                }

                node = node.ch[c - 'a'];
            }
            node.wordEnd = true;
        }

        public String search(String s) {
            Node node = root;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (node.ch[c - 'a'] == null) {
                    return "";
                }
                node = node.ch[c - 'a'];
                if (node.wordEnd) return s.substring(0, i + 1);
            }

            return "";
        }
    }

    Trie trie = new Trie();

    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder sb = new StringBuilder();

        for (String s : dictionary) {
            trie.insert(s);
        }

        String[] strings = sentence.split(" ");

        for (String s : strings) {
            String r = trie.search(s);

            if (r.equals("")) sb.append(s);
            else sb.append(r);

            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
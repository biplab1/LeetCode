/*
 * Method 1.0:
 * Extra optimizations to beat some skewed test cases
 */

 class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        if (m * n < word.length()) return false;

        int[] freq = new int[128];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                freq[board[i][j]]++;
            }
        }

        for (char c : word.toCharArray()) {
            freq[c]--;
            if (freq[c] < 0) return false;
        }

        if (freq[word.charAt(0)] > freq[word.charAt(word.length() - 1)]) 
            word = new StringBuilder(word).reverse().toString();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (word.charAt(0) == board[i][j] && solve(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean solve(char[][] board, int i, int j, String word, int index) {
        if (index == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || 
            word.charAt(index) != board[i][j] || board[i][j] == '0') return false;

        char temp = board[i][j];
        board[i][j] = '0';

        if (solve(board, i + 1, j, word, index + 1) ||
            solve(board, i - 1, j, word, index + 1) ||
            solve(board, i, j - 1, word, index + 1) ||
            solve(board, i, j + 1, word, index + 1)) return true;
    
        board[i][j] = temp;

        return false;
    }
}

/*
 * Method 1:
 * SC : O(1)
 */
/*
 * class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (word.charAt(0) == board[i][j] && solve(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean solve(char[][] board, int i, int j, String word, int index) {
        if (index == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || 
            word.charAt(index) != board[i][j] || board[i][j] == '0') return false;

        char temp = board[i][j];
        board[i][j] = '0';

        if (solve(board, i + 1, j, word, index + 1) ||
            solve(board, i - 1, j, word, index + 1) ||
            solve(board, i, j - 1, word, index + 1) ||
            solve(board, i, j + 1, word, index + 1)) return true;
    
        board[i][j] = temp;

        return false;
    }
}
 */

/*
 * Method 2:
 * SC : O(m * n)
 */
/*
 * class Solution {
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (word.charAt(0) == board[i][j] && solve(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean solve(char[][] board, int i, int j, String word, int index) {
        if (index == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || 
            word.charAt(index) != board[i][j] || visited[i][j]) return false;

        visited[i][j] = true;

        if (solve(board, i + 1, j, word, index + 1) ||
            solve(board, i - 1, j, word, index + 1) ||
            solve(board, i, j - 1, word, index + 1) ||
            solve(board, i, j + 1, word, index + 1)) return true;
    
        visited[i][j] = false;

        return false;
    }
}
 */
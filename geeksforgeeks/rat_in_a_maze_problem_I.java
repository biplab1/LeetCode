

// User function Template for Java

// m is the given matrix and n is the order of matrix

class Choice {
    char dname; 
    int dx, dy;

    public Choice(char dname, int dx, int dy) {
        this.dname = dname;
        this.dx = dx;
        this.dy = dy;
    }
}

class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        
        ArrayList<String> res = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        Choice[] choices = {new Choice('U', -1, 0), new Choice('D', 1, 0), 
                                new Choice('L', 0, -1), new Choice('R', 0, 1)};

        if (m[0][0] == 1) {
            solve(0, 0, n, res, path, m, choices);
        }

        return res;
    }
    
    private static boolean isSolved(int x, int y, int n) {
        return x == n - 1 && y == n - 1;
    }

    private static boolean isValid(int x, int y, int n, int[][] arr) {
        return x >= 0 && x < n && y >= 0 && y < n && arr[x][y] == 1;
    }

    private static void solve(int x, int y, int n, ArrayList<String> res,
                                StringBuilder path, int[][] arr, Choice[] choices) {
        if (isSolved(x, y, n)) {
            res.add(path.toString());
            return;
        }

        for (Choice choice : choices) {
            int newX = x + choice.dx;
            int newY = y + choice.dy;
            if (isValid(newX, newY, n, arr)) {
                arr[x][y] = 0;
                path.append(choice.dname);
                solve(newX, newY, n, res, path, arr, choices);
                arr[x][y] = 1;
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
}
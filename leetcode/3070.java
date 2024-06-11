class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int ways = 0;
        int[] colSum = new int[grid[0].length];
        
        for (int[] row : grid) {
            int sum = 0;
            for (int i = 0; i < row.length; i++) {
                colSum[i] += row[i];
                if (colSum[i] > k) break;
                sum += colSum[i];
                if (sum > k) break;
                ways++;
            }
        }
        
        return ways;
    }
}

/*
grid is n x m matrix
Input: grid = [[7,6,3],[6,6,1]], k = 18
Output: 4

7 6 3
6 6 1

7 
7 6 
7 6 3
7 6

4 ways

-----------------------------------------------

Input: grid = [[7,2,9],[1,5,0],[2,6,6]], k = 20
Output: 6

7 2 9 
1 5 0
2 6 6

row wise sum
7  2  9
8  7  9
10 13 15

col wise sum
7 9 18
1 6 6
2 8 14

7
7 2
7 2 9
7 1
7 1 2

7 2 
1 5

6 ways

*/
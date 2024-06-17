class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long maxArea = 0;

        int n = bottomLeft.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int iLx = bottomLeft[i][0];
                int iLy = bottomLeft[i][1];
                int iRx = topRight[i][0];
                int iRy = topRight[i][1];

                int jLx = bottomLeft[j][0];
                int jLy = bottomLeft[j][1];
                int jRx = topRight[j][0];
                int jRy = topRight[j][1];

                int lX = Math.max(iLx, jLx);
                int lY = Math.max(iLy, jLy);
                int rX = Math.min(iRx, jRx);
                int rY = Math.min(iRy, jRy);

                if (lX < rX && lY < rY) {
                    long square = Math.min(rX - lX, rY - lY);
                    maxArea = Math.max(maxArea, square * square);
                }
            }
        }
        
        return maxArea;
    }
}

/*
*/
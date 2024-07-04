class Solution {
    private enum DIR {
        UP, DOWN, LEFT, RIGHT
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> out = new ArrayList<>();
        int m  = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = 0;
        int upperI = m;
        int upperJ = n;
        int lowerI = -1;
        int lowerJ = -1;
        DIR direction = DIR.RIGHT;

        while (i >= lowerI && i < upperI && j >= lowerI && j < upperJ) {
            switch(direction) {
                case RIGHT: {
                    while (j < upperJ) {
                        out.add(matrix[i][j]);
                        j++;
                    }
                    j--;
                    i++;
                    direction = DIR.DOWN;
                    lowerI++;
                    break;
                }
                case DOWN: {
                    while (i < upperI) {
                        out.add(matrix[i][j]);
                        i++;
                    }
                    i--;
                    j--;
                    direction = DIR.LEFT;
                    upperJ--;
                    break;
                }
                case LEFT: {
                    while (j > lowerJ) {
                        out.add(matrix[i][j]);
                        j--;
                    }
                    j++;
                    i--;
                    direction = DIR.UP;
                    upperI--;
                    break;
                }
                case UP: {
                    while (i > lowerI) {
                        out.add(matrix[i][j]);
                        i--;
                    }
                    i++;
                    j++;
                    direction = DIR.RIGHT;
                    lowerJ++;
                    break;
                }
            }
        }

        return out;
    }
}
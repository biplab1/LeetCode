class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int lx1 = ax2 - ax1;
        int ly1 = ay2 - ay1;

        int area1 = lx1 * ly1;

        int lx2 = bx2 - bx1;
        int ly2 = by2 - by1;

        int area2 = lx2 * ly2;

        // area of intersection if any
        int commonArea = 0;
        int cx1 = Math.max(ax1, bx1);
        int cy1 = Math.max(ay1, by1);
        int cx2 = Math.min(ax2, bx2);
        int cy2 = Math.min(ay2, by2);
        if (cx1 < cx2 && cy1 < cy2) {
            int lxC = cx2 - cx1;
            int lyC = cy2 - cy1;
            commonArea = lxC * lyC;
        }

        return area1 + area2 - commonArea;
        
    }
}
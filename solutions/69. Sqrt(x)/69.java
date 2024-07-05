class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                return mid;
            else
                start = mid + 1;
        }

        return Math.round(end);
    }
}
class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;
        long mid = 0;
        long y = num;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid * mid == y) 
                return true;
            else if (mid * mid < y)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }
}
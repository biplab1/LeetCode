class Solution {
    public long minEnd(int n, int x) {
       int v = n - 1;

       long ans = x;

       for (long b = 1; v > 0; b <<= 1) {
            if ((b & x) == 0) {
                if ((v & 1) == 1) {
                    ans |= b;
                }
                v >>= 1;
            } 
       }

       return ans;
    }
}
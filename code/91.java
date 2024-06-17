class Solution {

    private static int ways(char[] c, int p, int[] t) {

        if (p == c.length) {     // successfully reached the end of string
            return 1;
        }

        if (c[p] == '0') {       // check for any leading zeros
            return 0;     // stop pursuing this choice
        }

        if (t[p] != -1) return t[p];  // check if value exists in storage

        int temp = ways(c, p + 1, t);  // single character
        
        if (p < c.length - 1) {
            if (c[p] == '1' || (c[p] == '2' && c[p+1] <= '6')) {
                temp += ways(c, p + 2, t);    // double character (10 <= x <= 26)
            }
        }

        return t[p] = temp;
    }

    public static int numDecodings(String s) {
        if (s == null || s.isEmpty()) return 0;

        int[] t = new int[s.length() + 1];
        Arrays.fill(t, -1);

        if (s.charAt(0) == '0') return 0;
        else {
            return ways(s.toCharArray(), 0, t);
        }
    }
}
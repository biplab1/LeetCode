class Solution {
    public int numSteps(String s) {
        int steps = 0;

        int carry = 0;

        for (int i = s.length() - 1; i >= 1; i--) {
            int lsb = s.charAt(i) - '0';

            if (lsb + carry == 1) {
                carry = 1; // since one is added 1 and it generates a carry
                steps += 2; // 2 steps: one to make even and then divided by 2
            } else {
                steps++; // 1 step: divide by 2
            }
        }

        // since msb is always 1, if carry from processing 2nd msb is 1 
        // then only one more step is required, that is divide by 2 else we have reached 1
        return steps + carry; 
    }
}
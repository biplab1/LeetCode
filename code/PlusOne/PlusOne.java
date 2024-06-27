class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int unit;
        int len = digits.length;
        int temp;
        for (int i = len - 1; i >= 0; i--) {
            temp = digits[i];
            temp += carry;
            unit = temp % 10;
            carry = temp/10;
            digits[i] = unit;
        }
        if (carry != 0) {
            int[] result = new int[len+1];
            result[0] = carry;
            for (int i = 0; i < len; i++) {
                result[i+1] = digits[i];
            }
            return result;
        }
        return digits;
    
    }
}
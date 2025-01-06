/*
Method 1: Using stringbuilder, TC: O(n), SC: O(n)
 */
class Solution {
    public int addDigits(int num) {
        StringBuilder sb = new StringBuilder(num + "");

        while (sb.length() > 1) {
            int sum = 0;
            for (char c : sb.toString().toCharArray()) {
                sum += c - '0';
            }
            sb.setLength(0);
            sb.append(sum);
        }

        return Integer.parseInt(sb.toString());
    }
}

/*
Method 2: Using Math, TC: O(1), SC: O(1)
 */
/*
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
¡†
        return num % 9 == 0 ? 9 : num % 9;
    }
}
 */

/*
Method 3: TC: O(log n), where n is number of digits in the input
 */
/*
class Solution {
    public int addDigits(int num) {
        if (num < 10) return num;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return addDigits(sum);
    }
}
 */

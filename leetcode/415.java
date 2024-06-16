/*
Method 1.0
*/
class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            carry = sum / 10;
            sb.append(sum % 10);
        }

        return sb.reverse().toString();
    }
}

/*
Method 1.1
*/
/*
class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        if (num1.equals("0") && num2.equals("0")) return "0";
        if (num1.equals("0")) return num2;
        if (num2.equals("0")) return num1;

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = 0;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            sum += carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }

        return sb.reverse().toString();
    }
}
*/

/*
Method 1.2
*/
/*
class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        if (num1.equals("0") && num2.equals("0")) return "0";
        if (num1.equals("0")) return num2;
        if (num2.equals("0")) return num1;

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = 0;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            sum += carry;
            carry = sum / 10;
            sb.insert(0, sum % 10);
        }

        return sb.toString();
    }
}
*/
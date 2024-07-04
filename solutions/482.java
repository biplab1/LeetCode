class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != '-') {
                sb.append(s.charAt(i));
                count++;

                if (count == k && i != 0) {
                    sb.append('-');
                    count = 0;
                }  
            }
        }

        if (sb.length() != 0 && sb.charAt(sb.length() - 1) == '-') sb.delete(sb.length() -1, sb.length());

        return sb.reverse().toString().toUpperCase();
    }
}
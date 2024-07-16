/*
Method 1:
 */
class Solution {
    public int compareVersion(String version1, String version2) {
        int l1 = version1.length();
        int l2 = version2.length();

        int i = 0, j = 0;

        while (i < l1 || j < l2) {
            int n1 = 0;
            int n2 = 0;

            while (i < l1 && version1.charAt(i) != '.') {
                n1 = 10 * n1 + version1.charAt(i) - '0';
                i++;
            }

            while (j < l2 && version2.charAt(j) != '.') {
                n2 = 10 * n2 + version2.charAt(j) - '0';
                j++;
            }

            if (n1 < n2) return -1;
            if (n1 > n2) return 1;
            i++;
            j++;
        }

        return 0;

    }
}

/*
Method 2:
 */
/*
class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int i = 0;

        while (i < v1.length || i < v2.length) {
            int n1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int n2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (n1 < n2) return -1;
            if (n1 > n2) return 1;
            i++;
        }

        return 0;
    }
}
 */

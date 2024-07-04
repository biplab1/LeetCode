class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int j = 0;
        int i = 0;
        int cost = 0;
        int maxLen = 0;

        while (j < arr.length) {
            cost += arr[j];

            if (cost <= maxCost) {
                maxLen = Math.max(maxLen, j - i + 1);
            } else if (cost > maxCost) {
                while (cost > maxCost) {
                    cost -= arr[i];
                    i++;
                }
            }
            j++;
        }

        return maxLen;
    }
}
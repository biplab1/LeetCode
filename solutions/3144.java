class Solution {

    public int minimumSubstringsInPartition(String s) {
        char[] c = s.toCharArray();
        int n = c.length;

        boolean[][] balanced = new boolean[n][n];
        
        for (int i = 0; i < n; i++) {
            int[] cnt = new int[26];
            for (int j = i; j < n; j++) {
                cnt[c[j] - 'a']++;
                balanced[i][j] = isBalanced(cnt);
            }
        }

        int[] min = new int[n + 1];

        Arrays.fill(min, Integer.MAX_VALUE);
        min[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (!balanced[i][j]) continue;
                int curr = min[i] + 1;
                min[j + 1] = Math.min(curr, min[j + 1]);
            }
        }

        return min[n];
    }
    
    boolean isBalanced(int[] freq) {
        int max = Integer.MIN_VALUE;
        for (int num : freq) {
            max = Math.max(max, num);
        }

        for (int num : freq) {
            if (num != 0 && num != max) return false;
        }

        return true;
    }
}
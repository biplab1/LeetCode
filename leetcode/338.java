class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            result[i] = countOne(i);
        }

        return result;
    }

    private int countOne(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>= 1;
        }

        return count;
    }
}
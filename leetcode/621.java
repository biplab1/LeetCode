class Solution {

    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];

        for (char C : tasks) {
            count[C - 'A']++;
        }

        int max = 0;

        for (int num : count) {
            if (max < num) {
                max = num;
            }
        }

        int sameMax = 0;

        for (int num : count) {
            if (max == num) sameMax++;
        }

        int result = (max - 1) * (n + 1) + sameMax;

        return Math.max(result, tasks.length);
    }
}
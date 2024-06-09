class Solution {
    public int numberOfChild(int n, int k) {
        int direction = 1, index = 0;

        int temp = k / (n - 1);

        if (temp % 2 == 1) {
            index = n - 1;
            direction = -1;
        }

        index += direction * (k % (n - 1));
        return index;
    }
}
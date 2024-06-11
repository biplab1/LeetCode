class Solution {
    public int minimumLevels(int[] possible) {
        int sum = 0;
        
        for (int num : possible) {
            sum += num == 0 ? -1 : 1;
        }
        
        int scoreD = 0;
        int scoreB = 0;
        
        for (int i = 0; i < possible.length; i++) {
            scoreD += possible[i] == 0 ? -1 : 1;
            scoreB = sum - scoreD;
            if (scoreD > scoreB) {
                return i != possible.length - 1 ? i + 1 : -1;
            }
        }
        
        return -1;
    }
}
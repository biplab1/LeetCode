class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int wins = 0, winner = 0;

        for (int i = 1; i < skills.length; i++) {
            if (skills[winner] > skills[i]) {
                wins++;
            } else {
                winner = i;
                wins = 1;
            }
            if (wins == k) return winner;
        }

        return winner;
    }
}
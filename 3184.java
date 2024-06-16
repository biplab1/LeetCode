class Solution {
    public int countCompleteDayPairs(int[] hours) {
       int count = 0;
        
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                long temp = hours[i] + hours[j];
                if (temp % 24 == 0) count++;
            }
        }
        
        return count;
    }
}
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int[] count = new int[limit + 1];

        for (int p : people) count[p]++;

        int index = 0;

        for (int wt = 1; wt <= limit; wt++) {
            while(count[wt]-- > 0) {
                people[index++] = wt;
            }
        }

        int i = 0;
        int j = people.length - 1;

        int boats = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                boats++;
                i++;
            } else if (people[j] <= limit) {
                boats++;
            }
            j--;
        }

        return boats;
    }
}
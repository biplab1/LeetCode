/*
 * Method 1.0:
 */
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i = 0;
        int j = 0;

        int currCust = 0;
        int maxCust = 0;

        for (int k = 0; k < customers.length; k++) {
            currCust += (1 - grumpy[k]) * customers[k];
        }

        while (j < customers.length) {  
            currCust += grumpy[j] * customers[j];
            maxCust = Math.max(currCust, maxCust);

            if (j - i + 1 == minutes) {
                currCust -= grumpy[i] * customers[i];
                i++;
            }
            j++;
        }
        return maxCust;
    }
}

/*
 * Method 1.1:
 */
/*
 * class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int i = 0;
        int j = 0;

        int currCust = 0;
        int maxCust = 0;

        for (int k = 0; k < customers.length; k++) {
            if (grumpy[k] == 0)
                currCust += customers[k];
        }

        while (j < customers.length) {
            if (grumpy[j] == 1) {
                currCust += customers[j];
            }

            maxCust = Math.max(currCust, maxCust);
            if (j - i + 1 == minutes) {
                if (grumpy[i] == 1) {
                    currCust -= customers[i];
                }
                i++;
            }
            j++;
        }
        return maxCust;
    }
}
 */
 
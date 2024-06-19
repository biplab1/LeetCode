class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left = 1;
        int right = 0;

        for (int b : bloomDay) right = Math.max(right, b);

        if ((long) m * k > bloomDay.length) return -1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            int bouquets = getBouquets(bloomDay, k, mid);
            if (bouquets < m) {
                left = mid + 1;
            } else right = mid - 1;
        }

        return left;
    }

    private int getBouquets(int[] arr, int adj, int days) {
        int flowers = 0;
        int bouquets = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] > days) {
                flowers = 0;
            } else if (++flowers == adj) {
                bouquets++;
                flowers = 0;
            }
        }

        return bouquets;
    }
}
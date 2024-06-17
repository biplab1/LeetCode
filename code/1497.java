/*
Method 1.0
*/

class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];

        for (int a : arr) {
            freq[((a % k) + k) % k]++;
        }

        if (freq[0] % 2 != 0) return false;
        
        for (int i = 1; i <= k/2; i++) {
            if (freq[i] != freq[k - i]) return false;
        }

        return true;
    }
}


/*
Method 1.1
*/
/*

class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];

        for (int a : arr) {
            a %= k;
            if (a < 0) a += k;
            freq[a % k]++;
        }

        if (freq[0] % 2 != 0) return false;
        
        for (int i = 1; i <= k/2; i++) {
            if (freq[i] != freq[k - i]) return false;
        }

        return true;
    }
}
*/
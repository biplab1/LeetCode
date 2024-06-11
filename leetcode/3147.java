class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        
        for (int i = n - 1; i >= k; i--) {
            energy[i - k] += energy[i];
        }
        int max = Integer.MIN_VALUE;

        for (int num : energy) {
            max = Math.max(num, max);
        }
        
        return max;
        
    }
}
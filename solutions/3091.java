class Solution {
    public int minOperations(int k) {
        int start = 0;
        int end = k;
        int minOps = Integer.MAX_VALUE;
        
        for (int i = 0; i <= k; i++) {
            int addSide = i + 1;
            int dupSide = (k - 1)/addSide;

            minOps = Math.min(minOps, i + dupSide); 
        }
        return minOps;
        
    }
}
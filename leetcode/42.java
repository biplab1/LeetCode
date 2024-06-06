class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int[] rightMaxArr = new int[n];
        int[] leftMaxArr = new int[n];
        
        int leftMax = 0;
        
        for (int i = 0; i < n; i++) {
            leftMax = Math.max(leftMax, height[i]);
            leftMaxArr[i] = leftMax;
        }
        
        int rightMax = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            rightMax = Math.max(rightMax, height[i]);
            rightMaxArr[i] = rightMax;
        }
        
        int totalArea = 0;
        
        for (int i = 0; i < n; i++) {
            totalArea += Math.min(rightMaxArr[i], leftMaxArr[i]) - height[i];
        }
        
        return totalArea; 
    }
}
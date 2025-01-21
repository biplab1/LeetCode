/*
Method 1.0: Water is held between left max and right max for each height, and sum over water above each height
obtained by subtracting individual height from its min(right max, left max). Total 3 passes made
TC: O(N), N is number of elements in height array
SC: O(N), Arrays for storing left and right Max for each height
*/
class Solution {
    public int trap(int[] height) {
        int totalArea = 0;
        int n = height.length;

        int[] leftMaxArray = new int[n];
        int[] rightMaxArray = new int[n];

        int leftMax = 0;

        for (int i = 0; i < n; i++) {
            leftMax = Math.max(leftMax, height[i]);
            leftMaxArray[i] = leftMax;
        }

        int rightMax = 0;

        for (int i = n - 1; i >= 0; i--) {
            rightMax = Math.max(rightMax, height[i]);
            rightMaxArray[i] = rightMax;
        }

        for (int i = 0; i < n; i++) {
            totalArea += Math.min(rightMaxArray[i], leftMaxArray[i]) - height[i];
        }

        return totalArea;
    }
}

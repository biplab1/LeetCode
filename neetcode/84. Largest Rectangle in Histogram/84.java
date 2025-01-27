/*
Method 1.0: Using stack
Intution: a height can only be expanded into lower heights, so we stop at the next smallest heights
on both sides of that height. Next smallest heights are tracked using stack. Finally, calculate areas
associated with each height and find the max area.
TC: O(N)
SC: O(N)
 */

class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left = nextSmallestLeft(heights);
        int[] right = nextSmallestRight(heights);

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] - 1));
        }

        return maxArea;
    }

    private int[] nextSmallestLeft(int[] heights) {
        int[] left = new int[heights.length];

        Deque<Integer> stack = new LinkedList<>();
        int index = 0;

        for (int i = 0; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                left[index++] = -1;
            } else {
                left[index++] = stack.peek();
            }

            stack.push(i);
        }

        return left;
    }

    private int[] nextSmallestRight(int[] heights) {
        int[] right = new int[heights.length];

        Deque<Integer> stack = new LinkedList<>();

        int index = heights.length - 1;

        for (int i = heights.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right[index--] = heights.length;
            } else {
                right[index--] = stack.peek();
            }

            stack.push(i);
        }

        return right;
    }
}

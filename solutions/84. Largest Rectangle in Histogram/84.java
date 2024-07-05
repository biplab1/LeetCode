/*
 * Method 1:
 */
class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new LinkedList<>();
        int maxArea = 0;
        for (int i = 0; i <= heights.length; i++) {
            int height = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && height <= heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * w);
            }
            stack.push(i);
        }
        return maxArea;
    }
}

/*
 * Method 2:
 */
/*
 * class Solution {

    class Pair {
        int value;
        int pos;
        
        Pair(int value, int pos) {
            this.value = value;
            this.pos = pos;
        }
    }

    public int largestRectangleArea(int[] heights) {
        int[] left = nearestSmallestLeft(heights);
        int[] right = nearestSmallestRight(heights);
        
        int maxArea = Integer.MIN_VALUE;
        
        for (int i = 0; i < heights.length; i++) {
            int currArea = heights[i] * (right[i] - left[i] - 1);
            maxArea = Math.max(maxArea, currArea);
        }
        
        return maxArea;
    }

    private int[] nearestSmallestLeft(int[] heights) {
        int[] left = new int[heights.length];
        
        Deque<Pair> stack = new LinkedList<>();
        int index = 0;
        
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && stack.peekFirst().value >= heights[i]) {
                stack.removeFirst();
            }
            
            if (stack.isEmpty()) {
                left[index++] = -1; 
            } else {
                left[index++] = stack.peekFirst().pos;
            }
            
            stack.addFirst(new Pair(heights[i], i));
        }
        
        return left;
    }
    
    private int[] nearestSmallestRight(int[] heights) {
        int[] right = new int[heights.length];
        int n = heights.length;

        Deque<Pair> stack = new LinkedList<>();

        int index = heights.length - 1;

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peekFirst().value >= heights[i]) {
                stack.removeFirst();
            }

            if (stack.isEmpty()) {
                right[index--] = n;
            } else {
                right[index--] = stack.peekFirst().pos;
            }

            stack.addFirst(new Pair(heights[i], i));
        }

        return right;
    }
}
 */
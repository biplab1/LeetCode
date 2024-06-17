class Solution {

    class Pair {
        int value;
        int pos;
        
        Pair (int value, int pos) {
            this.value = value;
            this.pos = pos;
        }
    }

    public int maximalRectangle(char[][] matrix) {
        int ans = Integer.MIN_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;

        int[] arr = new int[m]; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '0') {
                    arr[j] = 0; 
                } else {
                    arr[j] += 1;
                }
            }
            ans = Math.max(ans, mah(arr, m));
        }

        return ans;
    }

        private int mah(int[] arr, int size) {
        
        int[] left = nextSmallestLeft(arr, size);
        int[] right = nextSmallestRight(arr, size);
        
        int maxArea = Integer.MIN_VALUE;
        
        for (int i = 0; i < size; i++) {
            int currArea = arr[i] * (right[i] - left[i] - 1);
            maxArea = Math.max(maxArea, currArea);
        }
        
        return maxArea;
    }
    
    private int[] nextSmallestLeft(int[] arr, int size) {
        int[] left = new int[size];
        Deque<Pair> stack = new LinkedList<>();
        
        int index = 0;
        
        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && stack.peekFirst().value >= arr[i]) {
                stack.removeFirst();
            }
            
            if (stack.isEmpty()) {
                left[index++] = -1;
            } else {
                left[index++] = stack.peekFirst().pos;
            }
            stack.addFirst(new Pair(arr[i], i));
        }
        
        return left;
    }
    
    
    private int[] nextSmallestRight(int[] arr, int size) {
        int[] right = new int[size];
        
        Deque<Pair> stack = new LinkedList<>();
        
        int index = size - 1;
        
        for (int i = size - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peekFirst().value >= arr[i]) {
                stack.removeFirst();
            }
            if (stack.isEmpty()) {
                right[index--] = size;
            } else {
                right[index--] = stack.peekFirst().pos;
            }
        
            stack.addFirst(new Pair(arr[i], i));
        }
        
        return right;
    }
}
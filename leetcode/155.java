class MinStack {
    int minEle;
    Stack<Integer> s;

    public MinStack() {
        s = new Stack<>();
        minEle = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
       if (val <= minEle) {
            s.push(minEle);
            minEle = val;
        }
        s.push(val);
    }
    
    public void pop() {
        if (s.pop() == minEle) {
            minEle = s.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minEle;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
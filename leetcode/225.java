/*
Method 1: Using single queue
*/

class MyStack {
    
    private Queue<Integer> q = new LinkedList<>();

    public MyStack() {
       
    }
    
    public void push(int x) {
        q.add(x);
        int n = q.size() - 1;
        int i = 0;
        while (i < n) {
            q.add(q.poll());
            i++;
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */


/*
Method 2: Using double queues

*/
/*

class MyStack {
    
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
        top = x;
    }
    
    public int pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }

        int popElement = q1.remove();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popElement;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

*/
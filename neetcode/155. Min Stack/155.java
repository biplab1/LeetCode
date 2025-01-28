/*
Method 1.0: Use a linked list where a node has three things- val, minVal, next pointer
Now, a new val is added and minVal updated, head always points to the latest entry and has
the current minVal.
To pop, move the head to next.
TC: O(1) all operations
 */
class MinStack {
    private Node head;

    public MinStack() {
        head = null;
    }

    public void push(int val) {
        if (head == null) {
            head = new Node(val, val, head);
        } else {
            head = new Node(val, Math.min(val, head.minVal), head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.minVal;
    }
}

class Node {
    int val;
    int minVal;
    Node next;

    Node(int val, int minVal, Node next) {
        this.val = val;
        this.minVal = minVal;
        this.next = next;
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

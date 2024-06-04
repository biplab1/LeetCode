class GfG
{
    int minEle;
    Stack<Integer> s;
    
    // Constructor    
    GfG()
	{
        minEle = Integer.MAX_VALUE;
        s = new Stack<>();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	    if (s.empty()) return -1;
	    return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here	
	    if (s.empty()) return -1;
	    int top = s.pop();
	    if (top == minEle) {
	        minEle = s.pop();
	    }
	    return top;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	    if (x <= minEle) {
	        s.push(minEle);
	        minEle = x;
	    }
	    s.push(x);
    }	
}
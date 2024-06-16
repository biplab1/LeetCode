/*
Method 1:
*/


/*Complete the function(s) below*/
class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           int minEle = Integer.MAX_VALUE;
           for (int value : s) {
               if (value < minEle) {
                   minEle = value;
               }
           }
           
           return minEle;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           return s.size() == n;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           return s.isEmpty();
	}
}


/*
Method 2:
*/

/*Complete the function(s) below*/
/*
class GfG{
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           int[] temp = new int[s.size()];
           int index = 0;
           int minEle = Integer.MAX_VALUE;
           
           while (!s.isEmpty()) {
               minEle = Math.min(minEle, s.peek());
               temp[index++] = s.pop();
           }
           
           for (int i = temp.length - 1; i >= 0; i--) {
               s.push(temp[i]);
           }
           
           return minEle;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if (s.size() == n) {
               return true;
           }
           return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           return s.isEmpty();
	}
}
*/
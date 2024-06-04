/*Complete the function below*/
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if (s.size() == 1) {
		    return s;
		}
		
		int top = s.pop();
		sort(s);
		insert(s, top);
		return s;
	}
	
	private void insert(Stack<Integer> s, int temp) {
	    if (s.isEmpty() || s.peek() < temp) {
	        s.push(temp);
	        return;
	    }
	    
	    int top = s.pop();
	    insert(s, temp);
	    s.push(top);
	}
}
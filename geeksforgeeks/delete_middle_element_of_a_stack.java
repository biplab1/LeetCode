/*
Method 1.0:
*/

//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s,int sizeOfStack){
        // code here
        int k;
        if (sizeOfStack == 0) return;
        k = sizeOfStack / 2 + 1;
        solve(s, k);
    } 
    
    private void solve(Stack<Integer> s, int k) {
        if (k == 1) {
            s.pop();
            return;
        }
        
        int top = s.pop();
        solve(s, k - 1);
        s.push(top);
    }
}


/*
Method 1.1;
*/
/*


//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s,int sizeOfStack){
        // code here
        int k;
        if (sizeOfStack == 0) return;
        if (sizeOfStack % 2 == 0) k = (sizeOfStack + 1)/2 + 1;
        else k = (sizeOfStack + 1) / 2;
        solve(s, k);
    } 
    
    private void solve(Stack<Integer> s, int k) {
        if (k == 1) {
            s.pop();
            return;
        }
        
        int top = s.pop();
        solve(s, k - 1);
        s.push(top);
    }
}

*/

/*
Method 2:
*/
/*

//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        if (s.size() == (sizeOfStack + 1)/2) {
            s.pop();
            return;
        }
        int temp = s.pop();
        deleteMid(s, sizeOfStack);
        s.push(temp);
    } 
}
*/
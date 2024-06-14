
//User function Template for Java

class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        int start = 0;
        int end = arr.length - 1;
        long result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == 1l) {
                result = mid * 1l;
                end = mid - 1;
            } else if (arr[mid] < 1) {
                start = mid + 1;
            }
        }
        
        return result;
    }
}


/*

//User function Template for Java


class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return start == arr.length? -1 : start;
    }
}

*/
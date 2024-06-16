/*
Method 1.0:
*/

class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int start = 0;
        int end = n - 1;
        int ans = -1;
        
        while (start <= end) {
            int mid = start + (end - end)/2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return ans;
    }
}
/*
Method 1.1:
*/
/*


class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int start = 0;
        int end = n - 1;
        
        while (start <= end) {
            int mid = start + (end - end)/2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return end;
    }
}
*/

/*
Method 1.2:
*/

/*

class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int start = 0;
        int end = n - 1;
        
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == x) {
                return mid;
            }
            else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
            
        }
        
        return result;
    }
    
}

*/

/*
Method 1.3:
*/
/*

class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int start = 0;
        int end = n - 1;
        
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] > x) {
                end = mid - 1;
            } else if (arr[mid] <= x) {
                result = mid;
                start = mid + 1;
            }
            
        }
        
        return result;
    }
    
}
*/
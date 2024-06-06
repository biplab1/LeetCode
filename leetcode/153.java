class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        
        return binarySearch(nums);
    }
    
    int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int N = arr.length;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % N;
            int prev = (mid + N - 1) % N;
            
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return arr[mid];
            }
            else if(arr[start] <= arr[end]){
	            return arr[start];
	        }
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else if (arr[mid] <= arr[end]) {
                end = mid - 1;
            }
        }
        
        return 0;
    }
}
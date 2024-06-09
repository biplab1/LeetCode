class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int [] arr = new int[n];
        
        Arrays.fill(arr, 1);
        for (int j = 0; j < k; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i] % 1000_000_007;
                arr[i] = sum;
            }
        }
        return arr[n - 1] ;
    }
}
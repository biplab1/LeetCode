class Solution {
    
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int q = queries.length;
        boolean[] answer = new boolean[q];
        
        int[] pref = new int[nums.length];
        
        for (int i = 1; i < nums.length; i++) {
            pref[i] = (pref[i - 1] + (nums[i - 1] + nums[i]) % 2);
        }
        
        for (int i = 0; i < q; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (pref[right] - pref[left] != right - left) {
                answer[i] = false;
            } else {
                answer[i] = true;
            }
            
        }
        
        return answer;
    }
}
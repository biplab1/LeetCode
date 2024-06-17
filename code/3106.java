class Solution {
    public String getSmallestString(String s, int k) {
        char[] out = s.toCharArray();
        
        for (int i = 0; i < out.length; i++) {
            int distA = Math.min((out[i] - 'a'), 26 - (out[i] - 'a'));
            
            if (distA <= k) {
                out[i] = 'a';
                k = k - distA;
            } else if (distA > k && k > 0) {
                out[i] = (char) (out[i] - k);
                k = 0;
            }
        }
        
        return new String(out);
    }
}
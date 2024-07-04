class Solution {
    public String[] shortestSubstrings(String[] arr) {
        
        String[] result = new String[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            String curr = null;
            
            for (int j = 0; j < s.length(); j++) {
                inner:
                for (int k = j + 1; k <= s.length(); k++) {
                    String sb = s.substring(j, k);
                    for (int l = 0; l < arr.length; l++) {
                        if (i == l) continue;
                        if (arr[l].contains(sb)) continue inner;
                    }
                    if (curr == null || sb.length() < curr.length() || 
                            sb.length() == curr.length() && sb.compareTo(curr) < 0) {
                                curr = sb;
                    }
                }
            }
            
            if (curr == null) curr = "";
            result[i] = curr;
        }
        
        return result;
    }
}
/*
 * Method 1.0:
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int i = 0;
        int j = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        while (j < n) {
            char jChar = s.charAt(j);
            map.put(jChar, map.getOrDefault(jChar, 0) + 1);

            if (j - i + 1 == map.size()) {
                ans = Math.max(ans, j - i + 1); 
                j++;
            } else {
                while(j - i + 1 > map.size()) {
                    char iChar = s.charAt(i);
                    int iCount = map.get(iChar);

                    map.put(iChar, --iCount);
                    if (iCount == 0) {
                        map.remove(iChar);
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}

/*
 * Method 1.1:
 */
/*
 * class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int i = 0;
        int j = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            i = Math.max(i, map.getOrDefault(c, 0));
            ans = Math.max(ans, j - i + 1);
            map.put(c, ++j);
        }

        return ans;
    }
}
 */
class Solution {
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
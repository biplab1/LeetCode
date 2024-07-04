/*
Method 1:
*/
class Solution {
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;

        for (char c='a'; c<='z';c++) {
            int index = s.indexOf(c);
            if (index != - 1 && index == s.lastIndexOf(c)) {
                ans = Math.min(ans, index);
            }
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans; 
    }
}

/*
Method 1.1:
*/
/*
class Solution {
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int index = s.indexOf(s.charAt(i));
            if (index != - 1 && index == s.lastIndexOf(s.charAt(i))) {
                ans = Math.min(ans, index);
            }
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans; 
    }
}
*/

/*
Method 2:
*/

/*
class Solution {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];

        for (char c : s.toCharArray()) {
            chars[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
*/
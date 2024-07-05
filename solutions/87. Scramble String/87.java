class Solution {
    Map<String, Boolean> map = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) return true;

        if (s1.length() < 2) return false;

        int n = s1.length();

        String key = s1 + " " + s2;
        if (map.containsKey(key)) return (boolean) map.get(key);

        boolean flag = false;

        for (int i = 1; i < n; i++) {
            if ((isScramble(s1.substring(0, i), s2.substring(n - i))) &&
                isScramble(s1.substring(i), s2.substring(0, n - i)) ||
                (isScramble(s1.substring(0, i), s2.substring(0, i)) && 
                isScramble(s1.substring(i), s2.substring(i)))) {
                    flag = true;
                    break;
                }
        }

        map.put(key, flag);
        return flag;
    }
}
class Solution {
    public String minWindow(String s, String t) {
        String minString = "";

        Map<Character, Integer> mapT = new HashMap<>();

        for (char c : t.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int minLeft = 0;
        int minRight = 0;
        int count = mapT.size();
        int minWindow = Integer.MAX_VALUE;

        while (j < s.length()) {
            if (mapT.containsKey(s.charAt(j))) {
                mapT.put(s.charAt(j), mapT.get(s.charAt(j)) - 1);
                if (mapT.get(s.charAt(j)) == 0) {
                    count--;
                }
            }

            while (count == 0) {
                if (j - i + 1 < minWindow) {
                    minWindow = j - i + 1;
                    minLeft = i;
                    minRight = j + 1;
                }
                if (mapT.containsKey(s.charAt(i))) {
                    mapT.put(s.charAt(i), mapT.get(s.charAt(i)) + 1);
                    if (mapT.get(s.charAt(i)) == 1) {
                        count++;
                    }
                }
                i++;
            }

            j++;

        }

        minString = s.substring(minLeft, minRight);

        return minString;
    }
}

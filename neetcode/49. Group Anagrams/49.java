class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] tmp = s.toCharArray();

            Arrays.sort(tmp);

            String sortedString = new String(tmp);

            if (!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

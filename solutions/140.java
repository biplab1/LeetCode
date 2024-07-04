class Solution {
    List<String> result;

    public List<String> wordBreak(String s, List<String> wordDict) {
        result = new ArrayList<>();
        Set<String> set = new HashSet<>(wordDict);

        solve(s, set, 0, new StringBuilder());
        return result;
    }

    private void solve(String s, Set<String> set, int start, StringBuilder curr) {
        if (start == s.length()) {
            result.add(curr.toString().trim());
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);

            if (set.contains(word)){
                int temp = curr.length();

                curr.append(" " + word);
                
                solve(s, set, end, curr);

                curr.setLength(temp);
            }
        }
    }
}
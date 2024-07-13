/*
Method 1:
Using HashSet
 */
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
/*
Method 2.0:
 */
/*
class Solution {
    List<String> result;

    public List<String> wordBreak(String s, List<String> wordDict) {
        result = new ArrayList<>();

        solve(s, wordDict, 0, new StringBuilder());
        return result;
    }

    private void solve(String s, List<String> wordDict, int index, StringBuilder curr) {
        if (index == s.length()) {
            result.add(curr.toString());
            return;
        }

        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);

            if (s.startsWith(word, index)) {
                int temp = curr.length();

                if (temp == 0) {
                    curr.append(word);
                } else {
                    curr.append(" " + word);
                }
                solve(s, wordDict, index + word.length(), curr);
                curr.delete(temp, curr.length());
            }
        }
    }
}
 */

/*
Method 2.1:
 */
/*
class Solution {
    List<String> result;

    public List<String> wordBreak(String s, List<String> wordDict) {
        result = new ArrayList<>();

        solve(s, wordDict, 0, new StringBuilder());
        return result;
    }

    private void solve(String s, List<String> wordDict, int index, StringBuilder curr) {
        if (index == s.length()) {
            result.add(curr.toString().trim());
            return;
        }

        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);

            if (s.startsWith(word, index)) {
                int temp = curr.length();
                curr.append(" " + word);
                solve(s, wordDict, index + word.length(), curr);
                curr.setLength(temp);
            }
        }
    }
}
 */

/*
Methdo 2.2:
 */
/*
class Solution {
    List<String> result;

    public List<String> wordBreak(String s, List<String> wordDict) {
        result = new ArrayList<>();

        solve(s, wordDict, 0, new StringBuilder());
        return result;
    }

    private void solve(String s, List<String> wordDict, int start, StringBuilder curr) {
        if (start == s.length()) {
            result.add(curr.toString().trim());
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);

            if (wordDict.contains(word)){
                int temp = curr.length();
                curr.append(" " + word);
                solve(s, wordDict, end, curr);
                curr.setLength(temp);
            }
        }
    }
}
 */

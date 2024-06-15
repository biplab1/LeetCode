class Solution {
    public char findTheDifference(String s, String t) {
        int sumS = 0;

        for (char c : s.toCharArray()) {
            sumS += (int) (c - 'a');
        }

        int sumT = 0;
        for (char c : t.toCharArray()) {
            sumT += (int) (c - 'a');
        }

        return (char) ((sumT - sumS) + 'a');
    }
}
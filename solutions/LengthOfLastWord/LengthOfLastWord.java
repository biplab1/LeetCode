class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        String lastEle = arr[arr.length - 1];
        return lastEle.length();
    }
}
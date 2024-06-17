class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        int result = 0;

        for (int num : arr1) {
            String s = num + "";
            for (int i = 0; i < s.length(); i++) {
                int temp = Integer.parseInt(s.substring(0, i + 1));
                set.add(temp);
            }
        }

        for (int num : arr2) {
            String s = num + "";
            for (int i = result; i < s.length(); i++) {
                int temp = Integer.parseInt(s.substring(0, i + 1));
                if (set.contains(temp)) {
                    result = i + 1;
                }
            }
        }

        return result;
    }
}
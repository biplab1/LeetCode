class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> dp = new ArrayList<>();

        for (int i : nums) {
            int pos = Collections.binarySearch(dp, i);
            pos = pos < 0 ? Math.abs(pos + 1) : pos;

            if (pos == dp.size()) {
                dp.add(i);
            } else {
                dp.set(pos, i);
            }
        }

        return dp.size();
    }
}
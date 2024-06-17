class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] aug = new int[nums.length + 1];
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            aug[num] = 1;
        }

        for (int i = 1; i < aug.length; i++) {
            if (aug[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
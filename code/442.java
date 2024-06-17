class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        {
            int i = 0;

            while (i < nums.length) {
                int j = nums[i] - 1;

                if (nums[i] != nums[j]) {
                    swap(nums, i, j);
                } else i++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }
}
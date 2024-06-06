class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();
        
        if (nums == null || n < 4) return result;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
        
            if (i > 0 && nums[i - 1] == nums[i]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long currSum = ((long) nums[i] + (long) nums[j] + (long) nums[left] + (long) nums[right]);

                    if (currSum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        System.out.print(currSum + " " + target);
                        left++;
                        right--;

                        while (left < right && nums[left - 1] == nums[left]) {
                            left++;
                        }
                        while (left < right && nums[right + 1] == nums[right]) {
                            right--;
                        }
                        
                    } else if (currSum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        
        return result;
    }
}
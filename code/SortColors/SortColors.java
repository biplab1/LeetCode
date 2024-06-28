/*
 * Method 1.0:
 */
class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];

        for (int num : nums) {
            colors[num]++;
        }

        int index = 0;

        for (int i = 0; i < 3; i++) {
            while (colors[i]-- > 0) {
                nums[index++] = i;
            }
        }
    }
}

/*
 * Method 1.1:
 */
/*
class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (int num : nums) {
            if (num == 0) zeros++;
            if (num == 1) ones++;
            if (num == 2) twos++;
        }

        int i = 0;
        for (; i < zeros; i++) {
            nums[i] = 0;
        }
        for (; i < zeros + ones; i++) {
            nums[i] = 1;
        }

        for (; i < nums.length; i++) {
            nums[i] = 2;
        }
    }

}
*/
/*
 * Method 2:
 */
/*
 * class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        int i = 0;

        while (i <= high) {
            if (nums[i] == 0) {
                swap(nums, i, low);
                i++;
                low++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
 */
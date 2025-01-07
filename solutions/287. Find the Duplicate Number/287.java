/*
Method 1.0: Using array
 */
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] check = new boolean[nums.length + 1];
        for (int num : nums) {
           if (check[num]) {
               return num;
           }
           check[num] = true;
        }
        return 0;
    }
}

/*
Method 1.1: Using HashSet
 */
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) return num;
        }
        return 0;
    }
}

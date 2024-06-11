class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
    
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int operations = 0;

        for (int key : map.keySet()) {
            int currCount = map.get(key);
            if (currCount == 1) return -1;
            else {
                operations += Math.ceil(currCount / (3 * 1.0));
            }
        }

        return operations;
    }
}
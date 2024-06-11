class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] result = new int[queries.length];
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                list.add(i);
            }
        }
        
        int index = 0;
        for (int query : queries) {
            if (query > list.size()) result[index++] = -1;
            else {
                result[index++] = list.get(query - 1);
            }
        }
        
        return result;
    }
}
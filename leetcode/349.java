class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();
        
        for (int num : nums1) {
            hashSet.add(num);
        }

        for (int num : nums2) {
            if (hashSet.contains(num)) {
                resultList.add(num);
                hashSet.remove(num);
            }
        }
        int [] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
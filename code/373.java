class Solution {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] + a[1] - (b[0] + b[1]));
        
        for (int i = 0; i < nums1.length && i < k; i++) {
            minHeap.offer(new int[]{nums1[i], nums2[0], 0});
        }

        for (int i = 0; i < k && !minHeap.isEmpty(); i++) {
            int[] temp = minHeap.poll();

            result.add(List.of(temp[0], temp[1]));
            int nums2Idx = temp[2];

            if (nums2Idx < nums2.length - 1) {
                minHeap.offer(new int[]{temp[0], nums2[nums2Idx + 1], nums2Idx + 1});
            }
        }

        return result;
    }
}
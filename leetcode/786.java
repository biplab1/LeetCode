class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int[] result = new int[2];

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> b[0] * a[1] - a[0] * b[1]);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                maxHeap.add(new int[]{arr[i], arr[j]});
                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
        }

        result = maxHeap.poll();

        return result;
    }
}
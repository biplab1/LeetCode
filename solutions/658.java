class Solution {

    static class Pair {
        int value;
        int diff;

        Pair (int value, int diff) {
            this.value = value;
            this.diff = diff;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
            (a, b) -> a.diff == b.diff ? b.value - a.value : b.diff - a.diff);

        for (int num : arr) {
            int diff = Math.abs(num - x);
            maxHeap.offer(new Pair(num, diff));

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll().value);
        }

        Collections.sort(result);
        return result;
    }
}
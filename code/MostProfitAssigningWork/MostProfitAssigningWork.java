class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Arrays.sort(worker);

        PriorityQueue<Integer> minDiff = new PriorityQueue<>((a, b) -> difficulty[a] - difficulty[b]);
        PriorityQueue<Integer> maxProf = new PriorityQueue<>((a, b) -> profit[b] - profit[a]);

        int result = 0;

        for (int i = 0; i < difficulty.length; i++) {
            minDiff.offer(i);
        }

        for (int ab : worker) {
            while(!minDiff.isEmpty() && difficulty[minDiff.peek()] <= ab) {
                maxProf.offer(minDiff.poll());
            }

            if (maxProf.isEmpty()) continue;

            result += profit[maxProf.peek()];
        }

        return result;
    }
}
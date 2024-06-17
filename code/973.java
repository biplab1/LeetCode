class Solution {

    class Pair {
        int dist;
        int[] coords;

        public Pair(int dist, int[] coords) {
            this.dist = dist;
            this.coords = coords;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.dist - a.dist);
        int[][] result = new int[k][2];

        for (int[] coord : points) {
            int x = coord[0];
            int y = coord[1];

            int dist = x * x + y * y;
            maxHeap.offer(new Pair(dist, coord));

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int index = 0;

        while (!maxHeap.isEmpty()) {
            Pair pair = maxHeap.poll();
            result[index][0] = pair.coords[0];
            result[index++][1] = pair.coords[1];
        }
        
        return result;
    }
}
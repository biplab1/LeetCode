class Solution {

    class Pair {
        int value;
        int freq;

        Pair (int value, int freq) {
            this.value = value;
            this.freq = freq;
        }
    }

    public int mostFrequentPrime(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int dx : new int[]{-1, 0, 1}) {
                    for (int dy : new int[]{-1, 0, 1}) {
                        if (dx == 0 && dy == 0) continue;
                        List<Integer> nums = new ArrayList<>();
                        int u = i, v = j, num = 0;
                        while (u >= 0 && u < n && 
                                        v >= 0 && v < m) {
                            num = num * 10 + mat[u][v];
                            nums.add(num);
                            u += dx;
                            v += dy;
                        }
                        for (int t : nums) {
                            if (t > 10 && isPrime(t)) {
                                map.put(t, map.getOrDefault(t, 0) + 1);
                            }
                        }
                    }
                }
            }
        }
        if (map.size() == 0) return -1;

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> 
                                                            b.freq == a.freq ? 
                                                            b.value - a.value : 
                                                            b.freq - a.freq);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(new Pair(entry.getKey(), entry.getValue()));
        }

        return maxHeap.peek().value;
    }

    public boolean isPrime(int x) {
        if (x <= 1) return false;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }

        return true;
    }
}
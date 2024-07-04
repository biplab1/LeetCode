class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        int[] indegree = new int[n];
        Deque<Integer> queue = new LinkedList<>();

        if (n <= 0) return new ArrayList<>();
        if (n == 1) return new ArrayList<>(List.of(0));

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
            indegree[edge[0]]++;
            indegree[edge[1]]++;
        } 

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 1) {
                queue.offerLast(i);
            }
        }

        int totalNodes = n;
        
        while (totalNodes > 2) {
            int queueSize = queue.size();
            totalNodes -= queueSize;

            for (int i = 0; i < queueSize; i++) {
                int node = queue.pollFirst();
                
                for (int u : graph[node]) {
                    indegree[u]--;
                    if (indegree[u] == 1) {
                        queue.offerLast(u);
                    }
                }
            }
        }

        return new ArrayList<>(queue);
    }
}
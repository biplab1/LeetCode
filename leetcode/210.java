class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List[] graph = new ArrayList[numCourses];
        int[] in_degree = new int[numCourses];

        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] pre : prerequisites) {
            in_degree[pre[0]]++;
            graph[pre[1]].add(pre[0]);
        }
        
        List<Integer> sortedOrder = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            if (in_degree[i] == 0) {
                queue.offerLast(i);
            }
        }

        while(!queue.isEmpty()) {
            int v = queue.poll();
            sortedOrder.add(v);
            for (int i = 0; i < graph[v].size(); i++) {
                int u = (int) graph[v].get(i);
                in_degree[u]--;
                if (in_degree[u] == 0) {
                    queue.offerLast(u);
                }
            }
        }

        if (sortedOrder.size() != numCourses) return new int[0];

        int[] result = new int[numCourses];
        int index = 0;

        for (int i : sortedOrder) {
            result[index++] = i;
        }

        return result;
    }
}
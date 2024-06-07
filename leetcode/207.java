class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List[] graph = new ArrayList[numCourses];
        int[] in_degree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] pre : prerequisites) {
            in_degree[pre[0]]++;
            graph[pre[1]].add(pre[0]);
        }

        Deque<Integer> queue = new LinkedList<>();

        int count = 0;

        for (int i = 0; i < numCourses; i++) {
            if (in_degree[i] == 0) {
                queue.offerLast(i);
                count++;
            }
        }
        
        while (!queue.isEmpty()) {
            int vertex = queue.pollFirst();
            for (int j = 0; j < graph[vertex].size(); j++) {
                int v = (int) graph[vertex].get(j);
                in_degree[v]--;
                if (in_degree[v] == 0) {
                    queue.offerLast(v);
                    count++;
                }
            }
        }
        
        if (count < numCourses) return false;
        
        return true;
    }
}
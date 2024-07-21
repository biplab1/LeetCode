/*
Method 1.0:
 */
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

/*
Method 1.1:
 */
/*
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] pre : prerequisites) {
            graph.computeIfAbsent(pre[0], _ -> new ArrayList<>()).add(pre[1]);
        }

        int[] in_degree = new int[numCourses];

        for (int key : graph.keySet()) {
            for (int n : graph.getOrDefault(key, new ArrayList<>())) {
                    in_degree[n]++;
            }
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
            for (int j : graph.getOrDefault(vertex, new ArrayList<>())) {
                    in_degree[j]--;
                    if (in_degree[j] == 0) {
                        queue.offerLast(j);
                        count++;
                }
            }
        }

        if (count < numCourses) return false;

        return true;
    }
}
 */

/*
Method 1.2:
 */
/*
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List[] graph = new ArrayList[numCourses];
        int[] in_degree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] pre : prerequisites) {
            in_degree[pre[1]]++;
            graph[pre[0]].add(pre[1]);
        }

        Deque<Integer> queue = new LinkedList<>();

        int count = 0;

        boolean[] visited = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (in_degree[i] == 0) {
                queue.offerLast(i);
                count++;
                visited[i] = true;
            }
        }

        while (!queue.isEmpty()) {
            int vertex = queue.pollFirst();
            for (int j = 0; j < graph[vertex].size(); j++) {
                    int v = (int) graph[vertex].get(j);
                    if (visited[v]) continue;
                    in_degree[v]--;
                    if (in_degree[v] == 0) {
                        queue.offerLast(v);
                        visited[v] = true;
                        count++;
                }
            }
        }

        if (count < numCourses) return false;

        return true;
    }
}
 */

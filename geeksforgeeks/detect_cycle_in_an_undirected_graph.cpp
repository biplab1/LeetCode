#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    // Function to detect cycle in an undirected graph.
    
    bool dfs(int vertex, int par, vector<int> g[], bool vis[]){
        vis[vertex] = true;
        bool isLoopExists = false;
        for (int child : g[vertex]){
    	    if (vis[child] and child == par) continue;
	        if (vis[child]) return true;
	    
	    isLoopExists |= dfs(child, vertex, g, vis);
        }
    return isLoopExists;
    }
    bool isCycle(int V, vector<int> adj[]) {
        // Code here
        bool vis[V];
        for (int i = 0; i <= V; i++){
            vis[i] = 0;
        }
	    for (int i = 1; i < V; i++){
		    if (vis[i]) continue;
            if (dfs(i, -1, adj, vis)) return true;
	    }
	    return false;
        
    }
};
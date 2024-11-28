package Graph;

import java.util.ArrayList;

public class DetectCycleInUndirectedGraphDFS {
    // while traversing through dfs store parent element also life (2,1) 1->2

    private boolean dfs(int node, int parent, int vis[], ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;// mark first node to be 1 in visted array
        // go to all adjacent nodes and check recersively
        // this loop check in adj list for each element first it will recursively go one side than second
        for(int adjacentNode: adj.get(node)) {
            if(vis[adjacentNode]==0) {
                // if any of the dfs returns true return true
                if(dfs(adjacentNode, node, vis, adj) == true)
                    return true;
            }//make sure it adjacent node should not be parent
            // if adjacent node is visited and is not its own parent node
            else if(adjacentNode != parent) return true;
        }
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        for(int i = 0;i<V;i++) {
            if(vis[i] == 0) {
                if(dfs(i, -1, vis, adj) == true) return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        DetectCycleInUndirectedGraphDFS obj = new DetectCycleInUndirectedGraphDFS();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }



}

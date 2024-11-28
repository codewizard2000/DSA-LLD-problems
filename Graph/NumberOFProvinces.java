package Graph;

import java.util.ArrayList;

// Provinces means each vertex can visit all vertices in the graph
public class NumberOFProvinces {

    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;
        for (int i = 0; i < adj.get(node).size(); i++) {
            int it = adj.get(node).get(i);
            if (!visited[it]) {
                dfs(it, adj, visited);
            }
        }
    }
// this method will terate over each vertices and check if its marked visited or not  and if not than apply dfs
    public static int countNumberOfProvinces(int v, ArrayList<ArrayList<Integer>> adj) {
        int count = 0;
        boolean[] visited = new boolean[v + 1];
        for (int i = 1; i <= v; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, adj, visited);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(5);
        adj.get(5).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(2).add(4);
        adj.get(4).add(2);

        int numberOfProvinces = countNumberOfProvinces(v, adj);
        System.out.println("Number of provinces: " + numberOfProvinces);
    }
}

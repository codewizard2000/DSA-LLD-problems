package TopoLogicalSortGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ShortestPathDirectedAcyclicGraph {
    // implementing normal TopoSort
    // create a array and assign it with infinity
    private void topologicalSort(int node, boolean[] visited, Stack<Integer> stack, ArrayList<ArrayList<Pair>> adj) {
        visited[node] = true;
        for (Pair neighbor : adj.get(node)) {
            if (!visited[neighbor.node]) {
                topologicalSort(neighbor.node, visited, stack, adj);
            }
        }
        stack.push(node);
    }

    public void shortestPath(int V, ArrayList<ArrayList<Pair>> adj, int src) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSort(i, visited, stack, adj);
            }
        }

        int[] dist = new int[V];// create a array and assign it with +infinity
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;


        while (!stack.isEmpty()) {
            int node = stack.pop();// check in adjency of each element and find the best path from source(popped element)
            if (dist[node] != Integer.MAX_VALUE) {
                for (Pair neighbor : adj.get(node)) {// traverse in adjaency list of popped element and check if weight is less than current than add the distance from parent to current node
                    if (dist[node] + neighbor.weight < dist[neighbor.node]) {
                        dist[neighbor.node] = dist[node] + neighbor.weight;
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.print("INF ");
            } else {
                System.out.print(dist[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(4, 1));
        adj.get(1).add(new Pair(2, 3));
        adj.get(2).add(new Pair(3, 6));
        adj.get(4).add(new Pair(2, 2));
        adj.get(4).add(new Pair(5, 4));
        adj.get(5).add(new Pair(3, 1));

        ShortestPathDirectedAcyclicGraph obj = new ShortestPathDirectedAcyclicGraph();
        obj.shortestPath(V, adj, 0);
    }


}

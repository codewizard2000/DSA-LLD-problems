package Graph;

import java.util.ArrayList;

import java.util.ArrayList;

public class GraphRepresentation {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(); // added n+1 in adjacent list
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // edge between 1-2 for undirected graph; if it's directed and 1->2 then only adj.get(1).add(2) will be there;
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(3);
        adj.get(3).add(1);

        // Print the graph
        printGraph(adj, n);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adj, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("Node " + i + ":");
            for (int j : adj.get(i)) {
                System.out.print(" -> " + j);
            }
            System.out.println();
        }
    }
}


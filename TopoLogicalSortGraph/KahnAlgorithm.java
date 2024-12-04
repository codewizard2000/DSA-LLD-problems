package TopoLogicalSortGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//insert all indegress in array of vertez size
// take out zero indegree and add in queue
// pop the queue and traverse the popped element
//traverse in adjacent popped element and reduce the degress of particular vertex
// pop till indegree of any element become zero
// add it in queue and traverse
// indree is calculated by traversing in adjaency list and travers 1-{3} you will do 3++
public class KahnAlgorithm {
    // Function to return list containing vertices in Topological order.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        // ma,king the indegree array traverse in adjaency list and increment
        int indegree[] = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<Integer>();

        // add in queue whose indgress is 0
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
// pop in queue and reduce the indegree
        int topo[] = new int[V];
        int i = 0;
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            topo[i++] = node;
            // node is in your topo sort
            // so please remove it from the indegree

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }

        return topo;
    }
    public static void main(String[] args){
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

        int[] ans = KahnAlgorithm.topoSort(V, adj);
        for (int node : ans) {
            System.out.print(node + " ");
        }
        System.out.println("");

    }
}

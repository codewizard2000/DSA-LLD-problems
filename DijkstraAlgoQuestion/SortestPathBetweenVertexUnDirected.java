package DijkstraAlgoQuestion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
// put the starting node in PQ and update the distance array and update the parent array
// when reached in destination in distance array start finding the destination node check there parent and at last add 1 because it started from there 
public class SortestPathBetweenVertexUnDirected {
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {

        // Create an adjacency list of pairs of the form node1 -> {node2, edge weight}
        // where the edge weight is the weight of the edge from node1 to node2.
        ArrayList<ArrayList<Pair1>> adj = new ArrayList<>();
        for(int i = 0;i<=n;i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0;i<m;i++) {
            adj.get(edges[i][0]).add(new Pair1(edges[i][1], edges[i][2]));
            adj.get(edges[i][1]).add(new Pair1(edges[i][0], edges[i][2]));
        }

        // Create a priority queue for storing the nodes along with distances
        // in the form of a pair { dist, node }.
        PriorityQueue<Pair1> pq =
                new PriorityQueue<Pair1>((x,y) -> x.first - y.first);

        // Create a dist array for storing the updated distances and a parent array
        //for storing the nodes from where the current nodes represented by indices of
        // the parent array came from.
        int[] dist = new int[n+1];
        int[] parent =new int[n+1];
        for(int i = 1;i<=n;i++) {
            dist[i] = (int)(1e9);
            parent[i] = i;
        }

        dist[1] = 0;

        // Push the source node to the Priorityqueue.
        pq.add(new Pair1(0, 1));
        while(pq.size() != 0) {

            // Topmost element of the priority queue is with minimum distance value.
            Pair1 it = pq.peek();
            int node = it.second;
            int dis = it.first;
            pq.remove();

            // Iterate through the adjacent nodes of the current popped node.
            for(Pair1 iter : adj.get(node)) {
                int adjNode = iter.first;
                int edW = iter.second;

                // Check if the previously stored distance value is
                // greater than the current computed value or not,
                // if yes then update the distance value.
                if(dis + edW < dist[adjNode]) {
                    dist[adjNode] = dis + edW;
                    pq.add(new Pair1(dis + edW, adjNode));

                    // Update the parent of the adjNode to the recent
                    // node where it came from.
                    parent[adjNode] = node;
                }
            }
        }

        // Store the final path in the ‘path’ array.
        List<Integer> path = new ArrayList<>();

        // If distance to a node could not be found, return an array containing -1.
        if(dist[n] == 1e9) {
            path.add(-1);
            return path;
        }

        int node = n;
        // o(N)
        while(parent[node] != node) {
            path.add(node);
            node = parent[node];
        }
        path.add(1);

        // Since the path stored is in a reverse order, we reverse the array
        // to get the final answer and then return the array.
        Collections.reverse(path);
        return path;
    }
    public static void main(String[] args) {
        int V = 5, E = 6;

        int[][] edges = {{1,2,2},{2,5,5},{2,3,4},{1,4,1},{4,3,3},{3,5,1}};

        SortestPathBetweenVertexUnDirected obj = new SortestPathBetweenVertexUnDirected();
        List < Integer > path = obj.shortestPath(V, E, edges);
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }



}

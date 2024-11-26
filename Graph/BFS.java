package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs =new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            Integer node= queue.poll();
            bfs.add(node);
            for(int i=0;i<adj.get(node).size();i++){
                int it = adj.get(node).get(i);
                if(!visited[it]){
                    visited[it]=true;
                    queue.add(it);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v=5;
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> ans = bfs(v, adj);
        System.out.print(ans);

    }

    // sc = o(n)
    //o(n)+o(2E)


}

package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DFS {
    public static void dfs(int node,ArrayList<Integer> dfs,boolean[] visited,ArrayList<ArrayList<Integer>> adj){
        visited[node]=true;
        dfs.add(node);
        for(int i=0;i<adj.get(node).size();i++){
            int it = adj.get(node).get(i);
            if(!visited[it]){
                dfs(it,dfs,visited,adj);// RECURSIVE CALL
            }
        }

    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int v=5;// 1 based indexing
        for(int i=0;i<=5;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(5);
        adj.get(5).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(2).add(4);
        adj.get(4).add(2);
        ArrayList<Integer> dfs = new ArrayList<>();
        boolean [] visited = new boolean[v+1];
        dfs(1,dfs,visited,adj);
        System.out.print(dfs);

    }
    //TC=O(N)+O(2E)
    //SC =O(N)

}

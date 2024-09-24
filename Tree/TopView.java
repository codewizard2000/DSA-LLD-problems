package Tree;

import java.util.*;

public class TopView {
    int data;
    TopView left;
    TopView right;

    public TopView(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public static ArrayList<Integer> topview(TopView root){
        ArrayList<Integer> res  = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Queue<Pair<TopView,Integer>> queue = new LinkedList<>();

        if(root==null){
            return res;
        }
        queue.add(new Pair<>(root,0));
        while(!queue.isEmpty()){
            Pair<TopView,Integer> pair = queue.poll();
            TopView node = pair.getFirst();
            int line = pair.getSecond();

            if(!map.containsKey(line)){
                map.put(line,node.data);
            }

            if(node.left!=null){
                queue.add(new Pair<>(node.left, line - 1));
            }

            if(node.right!=null){
                queue.add(new Pair<>(node.right, line + 1));
            }
        }

        for(Map.Entry<Integer,Integer> mpp : map.entrySet()){
            res.add(mpp.getValue());
        }
        return res;
    }
    public static void main(String args[]){
        TopView root = new TopView(1);
        root.left = new TopView(2);
        root.left.left = new TopView(4);
        root.left.right = new TopView(10);
        root.left.left.right = new TopView(5);
        root.left.left.right.right = new TopView(6);
        root.right = new TopView(3);
        root.right.right = new TopView(10);
        root.right.left = new TopView(9);

        // Get the Top View traversal
        ArrayList<Integer> topView = topview(root);

        // Print the result
        System.out.println("Top View Traversal: " + topView);
    }
}

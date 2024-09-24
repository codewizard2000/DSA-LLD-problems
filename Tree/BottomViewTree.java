package Tree;



import java.util.*;

public class BottomViewTree {
    int data;
    BottomViewTree left;
    BottomViewTree right;

    public BottomViewTree(int data){
        this.data=data;
        this.right=null;
        this.left= null;
    }

    public static ArrayList<Integer> bottomView(BottomViewTree root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Map<Integer,Integer> map = new HashMap<>();

        Queue<Pair<BottomViewTree, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root,0));

        while(!q.isEmpty()){
            Pair<BottomViewTree,Integer> pair = q.poll();
            BottomViewTree node = pair.getFirst();
            int line = pair.getSecond();

            map.put(line,node.data);

            if(node.left!=null){
                q.add(new Pair<>(node.left, line - 1));
            }

            if(node.right!=null){
                q.add(new Pair<>(node.right, line + 1));
            }

        }

        for(Map.Entry<Integer,Integer> mpp : map.entrySet()){
            res.add(mpp.getValue());
        }
        return res;
    }
    public static void main(String[] args) {
        // Creating a sample binary tree
        BottomViewTree root = new BottomViewTree(1);
        root.left = new BottomViewTree(2);
        root.left.left = new BottomViewTree(4);
        root.left.right = new BottomViewTree(10);
        root.left.left.right = new BottomViewTree(5);
        root.left.left.right.right = new BottomViewTree(6);
        root.right = new BottomViewTree(3);
        root.right.right = new BottomViewTree(10);
        root.right.left = new BottomViewTree(9);

        // Get the Bottom View traversal
        ArrayList<Integer> bottomView =bottomView(root);

        // Print the result
        System.out.println("Bottom View Traversal: " + bottomView);
    }
}

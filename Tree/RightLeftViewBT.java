package Tree;

import java.util.ArrayList;
import java.util.List;

public class RightLeftViewBT {
    public int data;
    public RightLeftViewBT right;
    public RightLeftViewBT left;

    public RightLeftViewBT(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }

    public static void recursiveleft(RightLeftViewBT root, int level, ArrayList<Integer> res){
        if(root==null){
            return ;
        }

        if(level==res.size()){
            res.add(root.data);
        }

        recursiveleft(root.left, level+1,res);
        recursiveleft(root.right,level+1,res);
    }

    public static void recursiveRight(RightLeftViewBT root, int level, ArrayList<Integer> res){
        if(root==null){
            return ;
        }

        if(level==res.size()){
            res.add(root.data);
        }

        recursiveRight(root.right, level+1,res);
        recursiveRight(root.left,level+1,res);
    }

    public static  List<Integer> recursive(RightLeftViewBT root){
        ArrayList<Integer> res = new ArrayList<>();

        recursiveRight(root,0,res);
        return res;

    }

    public static void main(String[] args){
        RightLeftViewBT root = new RightLeftViewBT(1);
        root.left = new RightLeftViewBT(2);
        root.right = new RightLeftViewBT(3);
        root.left.left = new RightLeftViewBT(4);
        root.left.right = new RightLeftViewBT(5);
        root.right.left = new RightLeftViewBT(6);
        root.right.right = new RightLeftViewBT(7);
        root.right.right.right = new RightLeftViewBT(8);



        ArrayList<Integer> result = (ArrayList<Integer>) recursive(root);
        System.out.print(result);

    }



}

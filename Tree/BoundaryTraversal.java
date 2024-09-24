package Tree;

import java.util.ArrayList;

public class BoundaryTraversal {
    int data;
    BoundaryTraversal right;
    BoundaryTraversal left;

    BoundaryTraversal(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public Boolean checkLeaf(BoundaryTraversal root){
        return root.left == null && root.right == null;
    }

    public void checkLeftBoundary(BoundaryTraversal root, ArrayList<Integer> res){
        BoundaryTraversal curr = root.left;
        while(curr != null){
            if(!checkLeaf(curr)){
                res.add(curr.data);
            }
            if(curr.left != null){
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    public void checkRightBoundary(BoundaryTraversal root, ArrayList<Integer> res){
        BoundaryTraversal curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while(curr != null){
            if(!checkLeaf(curr)){
                temp.add(curr.data);
            }
            if(curr.right != null){
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }

        for(int i = temp.size() - 1; i >= 0; i--){
            res.add(temp.get(i));
        }
    }

    public void addLeaves(BoundaryTraversal root, ArrayList<Integer> res){
        if(checkLeaf(root)){
            res.add(root.data);
        }else{
            if(root.left != null){
                addLeaves(root.left, res);
            }
            if(root.right != null){
                addLeaves(root.right, res);
            }
        }
    }

    public ArrayList<Integer> boundary(BoundaryTraversal root){
        ArrayList<Integer> res = new ArrayList<>();

        if(root == null){
            return res;
        }
        if(checkLeaf(root)){
           res.add(root.data);
           return res;
        }
        if(!checkLeaf(root)){
            res.add(root.data);
        }
        checkLeftBoundary(root, res);
        addLeaves(root, res);
        checkRightBoundary(root, res);

        return res;
    }

    public static void main(String[] args) {
        BoundaryTraversal root = new BoundaryTraversal(1);
        root.left = new BoundaryTraversal(2);
        root.right = new BoundaryTraversal(3);
        root.left.left = new BoundaryTraversal(4);
        root.left.right = new BoundaryTraversal(5);
        root.right.left = new BoundaryTraversal(6);
        root.right.right = new BoundaryTraversal(7);

        BoundaryTraversal tree = new BoundaryTraversal(0);
        ArrayList<Integer> boundary = tree.boundary(root);
        System.out.println(boundary);
    }
}


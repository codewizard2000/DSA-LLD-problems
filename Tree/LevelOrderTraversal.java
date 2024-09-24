package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    int data;
    LevelOrderTraversal left;
    LevelOrderTraversal right;

    LevelOrderTraversal(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void levelorder(LevelOrderTraversal root){
        if (root == null) {
            return;
        }

        Queue<LevelOrderTraversal> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            LevelOrderTraversal node = q.poll();
            System.out.print(node.data + " ");

            if(node.left != null){
                q.add(node.left);
            }
            if(node.right != null){
                q.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal root = new LevelOrderTraversal(1);
        root.left = new LevelOrderTraversal(2);
        root.right = new LevelOrderTraversal(3);
        root.left.left = new LevelOrderTraversal(4);
        root.left.right = new LevelOrderTraversal(5);
        root.right.left = new LevelOrderTraversal(6);
        root.right.right = new LevelOrderTraversal(7);

        System.out.println("Level Order Traversal of the tree:");
        levelorder(root);
    }
}


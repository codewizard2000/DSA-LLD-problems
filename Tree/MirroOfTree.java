package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MirroOfTree {
    int data;
    MirroOfTree left;
    MirroOfTree right;

    MirroOfTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static MirroOfTree mirror(MirroOfTree root){
        if (root == null) {
            return null;
        }

        Queue<MirroOfTree> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            MirroOfTree curr = q.poll();
            MirroOfTree temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
        return root;
    }

    static void inOrder(MirroOfTree root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        // Creating a binary tree
        MirroOfTree root = new MirroOfTree(1);
        root.left = new MirroOfTree(2);
        root.right = new MirroOfTree(3);
        root.left.left = new MirroOfTree(4);
        root.left.right = new MirroOfTree(5);
        root.right.left = new MirroOfTree(6);
        root.right.right = new MirroOfTree(7);

        System.out.println("Original tree (in-order traversal): ");
        inOrder(root);
        System.out.println();

        // Convert to mirror
        mirror(root);

        System.out.println("Mirror tree (in-order traversal): ");
        inOrder(root);
    }
}

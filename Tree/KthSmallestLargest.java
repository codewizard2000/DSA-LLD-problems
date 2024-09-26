package Tree;

import java.util.ArrayList;

public class KthSmallestLargest {
    int data;
    KthSmallestLargest left;
    KthSmallestLargest right;

    KthSmallestLargest(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static void inorder(KthSmallestLargest root, ArrayList<Integer> res){
        if (root == null) {
            return;
        }

        inorder(root.left, res);
        res.add(root.data);
        inorder(root.right, res);
    }

    public static ArrayList<Integer> getelement(KthSmallestLargest root, int k){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root, res);
        list.add(res.get(k - 1));
        list.add(res.get(res.size() - k));
        return list;
    }

    public static void main(String[] args) {
        // Creating a BST
        KthSmallestLargest root = new KthSmallestLargest(10);
        root.left = new KthSmallestLargest(5);
        root.right = new KthSmallestLargest(13);
        root.left.left = new KthSmallestLargest(3);
        root.left.left.left = new KthSmallestLargest(2);
        root.left.left.right = new KthSmallestLargest(4);
        root.left.right = new KthSmallestLargest(6);
        root.left.right.right = new KthSmallestLargest(9);
        root.right.left = new KthSmallestLargest(11);
        root.right.right = new KthSmallestLargest(14);

        int k = 3;
        ArrayList<Integer> result = getelement(root, k);

        System.out.println("Kth smallest element: " + result.get(0));
        System.out.println("Kth largest element: " + result.get(1));
    }
}

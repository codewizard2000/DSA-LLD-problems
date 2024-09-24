package Tree;

public class BinaryTreeSearch {
    int data;
    BinaryTreeSearch left;
    BinaryTreeSearch right;

    BinaryTreeSearch(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static boolean search(BinaryTreeSearch root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        // Search in the left subtree
        boolean leftSearch = search(root.left, key);
        if (leftSearch) {
            return true;
        }
        // Search in the right subtree
        return search(root.right, key);
    }

    public static void main(String[] args) {
        BinaryTreeSearch root = new BinaryTreeSearch(10);
        root.left = new BinaryTreeSearch(5);
        root.right = new BinaryTreeSearch(15);
        root.left.left = new BinaryTreeSearch(2);
        root.left.right = new BinaryTreeSearch(7);
        root.right.left = new BinaryTreeSearch(12);
        root.right.right = new BinaryTreeSearch(20);

        int key = 7;
        System.out.println("Is the node with value " + key + " present in the tree? " + search(root, key));
    }
}

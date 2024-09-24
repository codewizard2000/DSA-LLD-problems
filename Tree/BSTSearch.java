package Tree;



public class BSTSearch {
    int data;
    BSTSearch left;
    BSTSearch right;

    BSTSearch(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static boolean searchBST(BSTSearch root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        // If key is less than root's data, search in the left subtree
        if (key < root.data) {
            return searchBST(root.left, key);
        }
        // If key is greater than root's data, search in the right subtree
        return searchBST(root.right, key);
    }

    public static void main(String[] args) {
        BSTSearch root = new BSTSearch(10);
        root.left = new BSTSearch(5);
        root.right = new BSTSearch(15);
        root.left.left = new BSTSearch(2);
        root.left.right = new BSTSearch(7);
        root.right.left = new BSTSearch(12);
        root.right.right = new BSTSearch(20);

        int key = 7;
        System.out.println("Is the node with value " + key + " present in the BST? " + searchBST(root, key));
    }
}


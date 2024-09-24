package Tree;

public class CheckBtisBST {
    int data;
    CheckBtisBST left;
    CheckBtisBST right;

    CheckBtisBST(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static  boolean isBST(CheckBtisBST root){
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static Boolean check(CheckBtisBST root, long min, long max){
        if (root == null) {
            return true;
        }
        if (root.data >= max || root.data <= min) {
            return false;
        }

        return check(root.right, root.data, max) && check(root.left, min, root.data);
    }

    public static void main(String[] args) {
        CheckBtisBST root = new CheckBtisBST(10);
        root.left = new CheckBtisBST(5);
        root.right = new CheckBtisBST(15);
        root.left.left = new CheckBtisBST(2);
        root.left.right = new CheckBtisBST(7);
        root.right.left = new CheckBtisBST(12);
        root.right.right = new CheckBtisBST(20);
        // Dummy node to access the method
        System.out.println("Is the given binary tree a BST? " + isBST(root));
    }
}

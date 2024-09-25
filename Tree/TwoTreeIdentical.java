package Tree;

public class TwoTreeIdentical {
    int data;
    TwoTreeIdentical left;
    TwoTreeIdentical right;

    TwoTreeIdentical(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public boolean identical(TwoTreeIdentical root1, TwoTreeIdentical root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.data != root2.data) {
            return false;
        }

        return identical(root1.left, root2.left) && identical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        TwoTreeIdentical tree1 = new TwoTreeIdentical(1);
        tree1.left = new TwoTreeIdentical(2);
        tree1.right = new TwoTreeIdentical(3);

        TwoTreeIdentical tree2 = new TwoTreeIdentical(1);
        tree2.left = new TwoTreeIdentical(2);
        tree2.right = new TwoTreeIdentical(3);

        TwoTreeIdentical treeChecker = new TwoTreeIdentical(0); // Dummy node to call the method
        boolean result = treeChecker.identical(tree1, tree2);

        System.out.println("The trees are identical: " + result);
    }
}

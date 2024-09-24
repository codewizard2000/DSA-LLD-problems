package Tree;

public class Mirrorofitself {
    public int data;
    public Mirrorofitself left;
    public Mirrorofitself right;

    Mirrorofitself(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static boolean mirror(Mirrorofitself root) {
        if (root == null ) {
            return true;
        }
        if(Symmetry(root.left, root.right)==true){
            return true;

        }
        return false;
    }

    public static boolean Symmetry(Mirrorofitself rootleft, Mirrorofitself rootright) {
        if (rootleft == null && rootright == null) {
            return true;
        }
        if (rootleft == null || rootright == null) {
            return false;
        }
        if (rootleft.data != rootright.data) {
            return false;
        }
        return Symmetry(rootleft.left, rootright.right) && Symmetry(rootleft.right, rootright.left);
    }

    public static void main(String[] args) {
        Mirrorofitself root = new Mirrorofitself(1);
        root.left = new Mirrorofitself(2);
        root.right = new Mirrorofitself(2);
        root.left.left = new Mirrorofitself(3);
        root.left.right = new Mirrorofitself(4);
        root.right.left = new Mirrorofitself(4);
        root.right.right = new Mirrorofitself(3);

        if (mirror(root)) {
            System.out.println("The tree is a mirror of itself.");
        } else {
            System.out.println("The tree is not a mirror of itself.");
        }
    }
}

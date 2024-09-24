package Tree;

public class BalancedBT {
    int data;
    BalancedBT left;
    BalancedBT right;

    BalancedBT(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static int height(BalancedBT root) {
        if (root == null) {
            return 0;
        } else {
            int left = height(root.left);
            if (left == -1) {
                return -1;
            }

            int right = height(root.right);
            if (right == -1) {
                return -1;
            }

            if (Math.abs(left - right) > 1) {
                return -1;
            }
            return Math.max(left, right) + 1;
        }
    }

    public static boolean isBalanced(BalancedBT root) {
        if(height(root) != -1){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        BalancedBT root = new BalancedBT(1);
        root.left = new BalancedBT(2);
        root.right = new BalancedBT(3);
        root.left.left = new BalancedBT(4);
        root.left.right = new BalancedBT(5);
        root.right.right = new BalancedBT(6);
        root.left.left.left = new BalancedBT(7);

        if (isBalanced(root)) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }
    }
}

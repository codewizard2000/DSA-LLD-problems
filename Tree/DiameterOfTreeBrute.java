package Tree;

public class DiameterOfTreeBrute {
    int data;
    DiameterOfTreeBrute left;
    DiameterOfTreeBrute right;

    public DiameterOfTreeBrute(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static int diameter(DiameterOfTreeBrute root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int result = Math.max(lh + rh + 1, Math.max(ld, rd));
        return result;
    }

    public static int height(DiameterOfTreeBrute root) {
        if (root == null) {
            return 0;
        } else {
            int lh = height(root.left);
            int rh = height(root.right);
            return 1 + Math.max(lh, rh);
        }
    }

    public static void main(String[] args) {
        // Create a sample tree
        DiameterOfTreeBrute root = new DiameterOfTreeBrute(1);
        root.left = new DiameterOfTreeBrute(2);
        root.right = new DiameterOfTreeBrute(3);
        root.left.left = new DiameterOfTreeBrute(4);
        root.left.right = new DiameterOfTreeBrute(5);
        root.right.left = new DiameterOfTreeBrute(6);
        root.right.right = new DiameterOfTreeBrute(7);

        // Calculate the diameter of the tree
        int treeDiameter = diameter(root);
        System.out.println("Diameter of the tree: " + treeDiameter);
    }
}


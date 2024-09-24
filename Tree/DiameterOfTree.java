package Tree;

public class DiameterOfTree {
    private int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return diameter;
    }

    private int calculateHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        // Update diameter if necessary
        diameter = Math.max(diameter, leftHeight + rightHeight+1);

        // Return height of the current node
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        // Constructed binary tree: 1 / 2 3 / 4 5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        DiameterOfTree solution = new DiameterOfTree();
        System.out.println("Diameter of the tree: " + solution.diameterOfBinaryTree(root));
    }
}

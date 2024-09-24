package Tree;

import java.util.HashMap;

public class ConstructBTusingPreOrderInorder {
    int data;
    ConstructBTusingPreOrderInorder left;
    ConstructBTusingPreOrderInorder right;

    ConstructBTusingPreOrderInorder(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static ConstructBTusingPreOrderInorder build(int[] inorder, int[] preorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildtree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    public static ConstructBTusingPreOrderInorder buildtree(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend, HashMap<Integer, Integer> map) {
        if (prestart > preend || instart > inend) {
            return null;
        }

        ConstructBTusingPreOrderInorder root = new ConstructBTusingPreOrderInorder(preorder[prestart]);
        int rootindex = map.get(root.data);
        int totalelemetleft = rootindex - instart;

        root.left = buildtree(preorder, prestart + 1, prestart + totalelemetleft, inorder, instart, rootindex - 1, map);
        root.right = buildtree(preorder, prestart + totalelemetleft + 1, preend, inorder, rootindex + 1, inend, map);

        return root;
    }

    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] preorder = {3, 9, 20, 15, 7};

        ConstructBTusingPreOrderInorder root = build(inorder, preorder);

        // Add code to print the tree or verify the structure
        printInOrder(root);
    }

    public static void printInOrder(ConstructBTusingPreOrderInorder root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }
}

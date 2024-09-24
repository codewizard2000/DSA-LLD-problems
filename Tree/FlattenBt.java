package Tree;

import java.util.Stack;

public class FlattenBt {
    int data;
    FlattenBt left;
    FlattenBt right;

    FlattenBt(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void flatten(FlattenBt root) {
        Stack<FlattenBt> st = new Stack<>();
        if (root == null) {
            return;
        }
        st.push(root);
        while (!st.empty()) {
            FlattenBt curr = st.pop();
            if (curr.right != null) {
                st.push(curr.right);
            }
            if (curr.left != null) {
                st.push(curr.left);
            }

            if (!st.empty()) {
                curr.right = st.peek();
            }
            curr.left = null;
        }
    }

    public static void printPreorder(FlattenBt root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void printFlattenTree(FlattenBt root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printFlattenTree(root.right);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        FlattenBt root = new FlattenBt(1);
        root.left = new FlattenBt(2);
        root.right = new FlattenBt(5);
        root.left.left = new FlattenBt(3);
        root.left.right = new FlattenBt(4);
        root.right.right = new FlattenBt(6);

        // Flatten the binary tree
        FlattenBt flattener = new FlattenBt(0); // Dummy node
        flattener.flatten(root);

        // Print the flattened tree
        System.out.println("Flattened tree:");
        printFlattenTree(root);
    }
}

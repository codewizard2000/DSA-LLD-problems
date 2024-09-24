package Tree;

public class LCA {
    public int data;
    public LCA left;
    public LCA right;

    public LCA(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static LCA lcaofTree(LCA root, LCA p, LCA q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        LCA left = lcaofTree(root.left, p, q);
        LCA right = lcaofTree(root.right, p, q);

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        LCA root = new LCA(3);
        root.left = new LCA(5);
        root.right = new LCA(1);
        root.left.left = new LCA(6);
        root.left.right = new LCA(2);
        root.right.left = new LCA(0);
        root.right.right = new LCA(8);
        root.left.right.left = new LCA(7);
        root.left.right.right = new LCA(4);

        LCA p = root.left; // Node with value 5
        LCA q = root.left.right.right; // Node with value 4

        LCA lca = lcaofTree(root, p, q);
        System.out.println("LCA of " + p.data + " and " + q.data + " is " + lca.data);
    }
}

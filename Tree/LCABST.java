package Tree;

public class LCABST {
    int data;
    LCABST left;
    LCABST right;

    LCABST(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static LCABST lca(LCABST root, LCABST p, LCABST q){
        if(root == null){
            return null;
        }
        if(root.data > p.data && root.data > q.data){
            return lca(root.left, p, q);
        } else if (root.data < p.data && root.data < q.data) {
            return lca(root.right, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        LCABST root = new LCABST(20);
        root.left = new LCABST(10);
        root.right = new LCABST(30);
        root.left.left = new LCABST(5);
        root.left.right = new LCABST(15);
        root.right.left = new LCABST(25);
        root.right.right = new LCABST(35);

        LCABST p = root.left; // Node with value 10
        LCABST q = root.right; // Node with value 30

        LCABST lcaNode = lca(root, p, q);
        if (lcaNode != null) {
            System.out.println("LCA of " + p.data + " and " + q.data + " is " + lcaNode.data);
        } else {
            System.out.println("LCA not found.");
        }
    }
}

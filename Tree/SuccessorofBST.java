package Tree;
public class SuccessorofBST {
    int data;
    SuccessorofBST left;
    SuccessorofBST right;

    SuccessorofBST(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static SuccessorofBST getSuccessor(SuccessorofBST root, SuccessorofBST p){
        SuccessorofBST successor = null;
        while(root != null){
            if(p.data>=root.data){
                root = root.right;
            } else {
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }

    public static void main(String[] args) {
        SuccessorofBST root = new SuccessorofBST(20);
        root.left = new SuccessorofBST(10);
        root.right = new SuccessorofBST(30);
        root.left.left = new SuccessorofBST(5);
        root.left.right = new SuccessorofBST(15);
        root.left.right.left = new SuccessorofBST(12);
        root.left.right.right = new SuccessorofBST(18);

        SuccessorofBST node = root.left.right; // Node with value 15
        SuccessorofBST successor = getSuccessor(root, node);

        if (successor != null) {
            System.out.println("The in-order successor of " + node.data + " is " + successor.data);
        } else {
            System.out.println("The in-order successor of " + node.data + " does not exist.");
        }
    }
}

package Tree;



public class PredecessorofBST {
    int data;
    PredecessorofBST left;
    PredecessorofBST right;

    PredecessorofBST(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static PredecessorofBST getPredecessor(PredecessorofBST root, PredecessorofBST p){
        PredecessorofBST predecessor = null;
        while(root != null){
            if(p.data <= root.data){
                root = root.left;
            } else {
                predecessor = root;
                root = root.right;
            }
        }
        return predecessor;
    }

    public static void main(String[] args) {
        PredecessorofBST root = new PredecessorofBST(20);
        root.left = new PredecessorofBST(10);
        root.right = new PredecessorofBST(30);
        root.left.left = new PredecessorofBST(5);
        root.left.right = new PredecessorofBST(15);
        root.left.right.left = new PredecessorofBST(12);
        root.left.right.right = new PredecessorofBST(18);

        PredecessorofBST node = root.left.right; // Node with value 15
        PredecessorofBST predecessor = getPredecessor(root, node);

        if (predecessor != null) {
            System.out.println("The in-order predecessor of " + node.data + " is " + predecessor.data);
        } else {
            System.out.println("The in-order predecessor of " + node.data + " does not exist.");
        }
    }
}


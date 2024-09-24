package Tree;

public class InorderTraversal {
    public int data;
    public InorderTraversal right;
    public InorderTraversal left;

    public InorderTraversal(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public static void  inordderTraversal(InorderTraversal node){
        if(node==null){
            return;
        }
        inordderTraversal(node.left);
        System.out.print(node.data+" ");
        inordderTraversal(node.right);
    }

    public static void main(String[] args){
        InorderTraversal root=new InorderTraversal(100);
        root.left = new InorderTraversal(20);
        root.right = new InorderTraversal(200);
        root.left.left = new InorderTraversal(10);
        root.left.right = new InorderTraversal(30);
        root.right.left = new InorderTraversal(150);
        root.right.right = new InorderTraversal(300);
        System.out.print("Inorder Traversal:  ");
        inordderTraversal(root);
    }


}

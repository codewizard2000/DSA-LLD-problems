package Tree;

public class PreOrder {
    public int data;
    public PreOrder left;
    public PreOrder right;

    public PreOrder(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public static void preorderTraversal(PreOrder node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    public static void main(String[] args){
        PreOrder root=new PreOrder(100);
        root.left = new PreOrder(20);
        root.right = new PreOrder(200);
        root.left.left = new PreOrder(10);
        root.left.right = new PreOrder(30);
        root.right.left = new PreOrder(150);
        root.right.right = new PreOrder(300);
        System.out.print("Inorder Traversal:  ");
        preorderTraversal(root);
    }

}

package Tree;

public class SumofNode {
    public int data;
    public SumofNode right;
    public SumofNode left;

    public SumofNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    public static int sum(SumofNode node){
        if(node==null){
            return 0;
        }

        int left=sum(node.left);
        int right=sum(node.right);
        int result=node.data+left+right;
        return result;
    }
    public static void main(String[] args){
        SumofNode root = new SumofNode(1);
        root.left = new SumofNode(2);
        root.right = new SumofNode(3);
        root.left.left = new SumofNode(4);
        root.left.right = new SumofNode(5);

        System.out.println("Height of the tree is: " + sum(root));
    }
}

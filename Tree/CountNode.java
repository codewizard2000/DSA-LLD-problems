package Tree;

public class CountNode {
    public int data;
    public CountNode left;
    public CountNode right;

    public CountNode(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }

    public static int countnode(CountNode node){
        if(node==null){
            return 0;
        }
        int left=countnode(node.left);
        int right=countnode(node.right);
        int result=left+right+1;
        return result;
    }
    public static void main(String[] args){
        CountNode root = new CountNode(1);
        root.left = new CountNode(2);
        root.right = new CountNode(3);
        root.left.left = new CountNode(4);
        root.left.right = new CountNode(5);

        System.out.println("Height of the tree is: " + countnode(root));
    }
}

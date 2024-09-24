package Tree;

public class Height {
    public int data;
    public Height left;
    public Height right;

    public Height(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public static int getHeight(Height node){
        if(node==null){
            return 0;
        }
        int left=getHeight(node.left);
        int right=getHeight(node.right);
        int result=Math.max(left,right)+1;
        return result;
    }
    public static void main(String[] args){
        Height root = new Height(1);
        root.left = new Height(2);
        root.right = new Height(3);
        root.left.left = new Height(4);
        root.left.right = new Height(5);

        System.out.println("Height of the tree is: " + getHeight(root));
    }
}

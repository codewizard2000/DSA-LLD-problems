package Tree;

public class LeftleavesSum {
    public int data;
    public LeftleavesSum right;
    public LeftleavesSum left;

    public LeftleavesSum(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }

    public static int leftsum(LeftleavesSum node){
        int sum=0;
        if(node==null){
            return 0;
        }

        if(node.left!=null && node.left.left==null && node.left.right==null){
            sum=sum+node.left.data;
        }

        if(node.right!=null && node.right.left==null && node.right.right==null){
            sum=sum+node.right.data;
        }

        sum=sum+leftsum(node.left);
        sum=sum+leftsum(node.right);
        return sum;


    }
//    public static int sumOfAllLeaves(LeftleavesSum node){
//        if(node == null){
//            return 0;
//        }
//
//        // Check if the node is a leaf node
//        if(node.left == null && node.right == null){
//            return node.data;
//        }
//
//        // Recursively sum the leaves of the left and right subtrees
//        return sumOfAllLeaves(node.left) + sumOfAllLeaves(node.right);
//    }

    public static void main(String[] args){
        LeftleavesSum root=new LeftleavesSum(1);
        root.left = new LeftleavesSum(2);
        root.right = new LeftleavesSum(3);
        root.right.right=new LeftleavesSum(6);
        root.right.left=new LeftleavesSum(7);
        root.left.left = new LeftleavesSum(4);
        root.left.right = new LeftleavesSum(5);

        System.out.println("sum of left leaves of the tree is: " + leftsum(root));
    }

}

package Tree;

public class MaxPathSum {
    int data;
    MaxPathSum left;
    MaxPathSum right;

    MaxPathSum(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static int max(MaxPathSum root, int[] maxi){
        if (root == null) {
            return 0;
        }
        int left = max(root.left, maxi);
        int right = max(root.right, maxi);
        maxi[0] = Math.max(maxi[0], left + right + root.data);

        return root.data + Math.max(left, right);
    }

    public static int maxPathSum(MaxPathSum root){
        int[] maxi = new int[1];
        maxi[0] = Integer.MIN_VALUE;

        max(root, maxi);
        return maxi[0];
    }

    public static void main(String[] args) {
        MaxPathSum root = new MaxPathSum(-10);
        root.left = new MaxPathSum(9);
        root.right = new MaxPathSum(20);
//        root.left.left = new MaxPathSum(20);
//        root.left.right = new MaxPathSum(1);
        root.right.right = new MaxPathSum(7);
        root.right.left = new MaxPathSum(15);
//        root.right.right.right = new MaxPathSum(4);

        System.out.println("Maximum path sum is: " + maxPathSum(root));
    }
}

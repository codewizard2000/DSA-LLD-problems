package Tree;

import java.util.HashSet;

public class TwoSum {
    int data;
    TwoSum left;
    TwoSum right;

    TwoSum(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public static boolean findPair(TwoSum root, int sum, HashSet<Integer> set){
        if(root==null){
            return false;
        }

        if(set.contains(sum - root.data)){
            return true;
        }
        set.add(root.data);

        return findPair(root.left, sum,set) || findPair(root.right, sum,set);
    }

    public static  boolean findtarget(TwoSum root, int sum){
        HashSet<Integer> set = new HashSet<>();
        return findPair(root,sum, set);
    }

    public static void main(String[] args){
        TwoSum root = new TwoSum(8);
        root.left = new TwoSum(4);
        root.right = new TwoSum(12);
        root.left.left = new TwoSum(2);
        root.left.right = new TwoSum(6);
        root.right.left = new TwoSum(10);
        root.right.right = new TwoSum(14);

        int targetSum = 100;
        boolean pairExists = findtarget(root, targetSum);

        System.out.println("Does a pair with sum " + targetSum + " exist in the BST? " + pairExists);
    }
}

package BinarySearch;

public class Search2DMatrix {
//    public static Boolean search(int[][] arr, int element){
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){// o(n2) brute force
//                if(arr[i][j]==elemet){
//                    return true;
//                }
//            }
//        }
//        return false;
//
//    }
    public static Boolean search(int[][] arr, int element){
        int n=arr.length;
        int m=arr[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/m;
            int col=mid%m;
            if(arr[row][col]==element){
                return true;
            } else if (arr[row][col]<element) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] arr ={{1,2,3,4},{5,6,7,8}};
        int element=10;
        Boolean result=search(arr,element);
        System.out.print(result);
    }

}

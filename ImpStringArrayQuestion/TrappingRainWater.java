package ImpStringArrayQuestion;

public class TrappingRainWater {
    public static int raiWaterTrapping(int[] arr){
        int[] leftmax = new int[arr.length];
        int[] rightmax = new int[arr.length];
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++ ){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }

        rightmax[rightmax.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        int waterTrapped=0;
        for(int i=0;i<arr.length;i++){
            waterTrapped =waterTrapped+ Math.min(leftmax[i],rightmax[i])-arr[i];

        }
        return waterTrapped;
    }



    public static void main(String[] args){
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        int result = raiWaterTrapping(arr);
        System.out.print(result);
    }


    //two pointer approach start from left and right check who is small if left than update left++ and update the left sum

//    public static int raiWaterTrapping(int[] arr) {
//        if (arr == null || arr.length == 0) {
//            return 0;
//        }
//
//        int left = 0;
//        int right = arr.length - 1;
//        int leftMax = 0;
//        int rightMax = 0;
//        int waterTrapped = 0;
//
//        while (left <= right) {
//            if (arr[left] <= arr[right]) {
//                if (arr[left] >= leftMax) {
//                    leftMax = arr[left];
//                } else {
//                    waterTrapped += leftMax - arr[left];
//                }
//                left++;
//            } else {
//                if (arr[right] >= rightMax) {
//                    rightMax = arr[right];
//                } else {
//                    waterTrapped += rightMax - arr[right];
//                }
//                right--;
//            }
//        }
//
//        return waterTrapped;
//    }

    // tc=o(n)
    //sc=o(n)
}

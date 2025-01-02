package SlidingWindow;

public class MaxConsecutiveOncesFlipKtimes {
    public static int maxConsecutiveAfterFlip(int[] arr,int k){
        int maxlengthonces=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]==0){
                k--;
            }
            while(k<0){
                if(arr[left]==0){
                    ++k;
                }
                left++;
            }
            maxlengthonces=Math.max(maxlengthonces,right-left+1);


        }
        return maxlengthonces;
    }
    public static void main(String[] args){
        int[] arr = { 1, 0, 1, 0, 1, 0, 1};
        int k=2;
        System.out.print(maxConsecutiveAfterFlip(arr,k));

    }
}

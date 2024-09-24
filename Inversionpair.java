public class Inversionpair {
    int MOD = 1000000007;
    int count = 0;

    public int solve(int[] A) {
        mergesort(A, 0, A.length - 1);
        return count;
    }

    public void mergesort(int[] arr,int start, int end ){
        if(start<end){
            int mid = start +(end-start)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }

    public void merge(int [] arr,int start, int mid, int end){
        int count=0;
        int i=start;
        int j=mid+1;
        int k=0;
        int n=arr.length;
        int[] res = new int[end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                i++;
                res[k]=arr[i];
                k++;
            }else{
                arr[k]=arr[j];
                j++;
                k++;
                count = (count + (mid - i + 1)) % MOD;

            }
        }

        while (i <= mid) {
            res[k]=arr[i];
            i++;
            k++;
        }
        while (j<=end){
            res[k]=arr[j];
            j++;
            k++;
        }

        System.arraycopy(res,0,arr,start,res.length);

    }
//    public static int iversion(int[] arr){
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j< arr.length;j++){
//                if(arr[i]>arr[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }//brute force approach





}

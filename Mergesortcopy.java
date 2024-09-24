public class Mergesortcopy {
    public static void sort(int[] arr,int start, int end){
        if(start<end){
            int mid = start+(end-start)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int i=start;
        int k=0;
        int j=mid+1;
        int[] res = new int[end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                res[k]=arr[i];
                i++;
                k++;
            }else{
                res[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            res[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            res[k]=arr[j];
            k++;
            j++;
        }

        System.arraycopy(res,0,arr,start,res.length);
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4};
        sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

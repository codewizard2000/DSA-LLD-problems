public class quickshort {
    public static void qsort(int[] arr, int start, int end){
        if(start<end){
            int p=partiton(arr,start,end);
            qsort(arr,start,p-1);
            qsort(arr,p+1,end);

        }

    }

    public static int partiton(int[] arr, int start, int end){
        int pivot = arr[end];
        int j=start;
        int i=start;
        while(i<=end){
            if(arr[i]<pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }else{
                i++;
            }

        }

        int temp=arr[end];
        arr[end]=arr[j];
        arr[j]=temp;

        return j;

    }

    public static void main(String[] args) {
        int[] arr = {9,1,3,6,8,11};
        qsort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}

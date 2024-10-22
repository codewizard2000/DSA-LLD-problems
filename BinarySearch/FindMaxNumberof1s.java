package BinarySearch;

public class FindMaxNumberof1s {
    public static int loweBound(int[] arr, int n, int x){
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >=x){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int numberof1s(int[][] arr, int n, int m){
        int count = 0;
        int index = -1;
        for(int i = 0; i < n; i++){
            int count_ones = m - loweBound(arr[i], m, 1);
            if(count_ones > count){
                count = count_ones;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[][] arr = {{0,0,0,1},{1,1,1,1}};
        int n = 2;
        int m = 4;
        int result = numberof1s(arr, n, m);
        System.out.print(result);
    }
}

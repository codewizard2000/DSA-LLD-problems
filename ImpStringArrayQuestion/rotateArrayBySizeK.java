package ImpStringArrayQuestion;

public class rotateArrayBySizeK {
    public static void reverse(int[] arr, int start, int end) {
        int left = start;
        int right = end;
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotateToLeft(int[] arr, int n, int k){
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
    public static void rotateToright(int[] arr, int n, int k){
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = 7;
        int k = 2;
        rotateToright(arr,n,k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

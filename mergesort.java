public class mergesort {

    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                k++;
                i++;
            } else {
                temp[k] = array[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            temp[k] = array[i];
            k++;
            i++;
        }

        while (j <= end) {
            temp[k] = array[j];
            k++;
            j++;
        }

        for (i = 0; i < temp.length; i++) {
            array[start + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

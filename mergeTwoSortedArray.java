import java.util.Arrays;

public class mergeTwoSortedArray {
    public static int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] c = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <=b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 6, 7};
        int[] result = merge(a, b);
        System.out.print(Arrays.toString(result));

    }

}

package BinarySearch;

public class MedianOfTwoShortedArray {
    public static int median(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1 + n2;
        int index2 = n3 / 2;
        int index1 = index2 - 1;
        int indexele1 = -1;
        int indexele2 = -1;
        int count = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (count == index1) {
                    indexele1 = arr1[i];
                }
                if (count == index2) {
                    indexele2 = arr1[i];
                }
                count++;
                i++;
            } else {
                if (count == index1) {
                    indexele1 = arr2[j];
                }
                if (count == index2) {
                    indexele2 = arr2[j];
                }
                count++;
                j++;
            }
        }

        while (i < n1) {
            if (count == index1) {
                indexele1 = arr1[i];
            }
            if (count == index2) {
                indexele2 = arr1[i];
            }
            count++;
            i++;
        }

        while (j < n2) {
            if (count == index1) {
                indexele1 = arr2[j];
            }
            if (count == index2) {
                indexele2 = arr2[j];
            }
            count++;
            j++;
        }

        if (n3 % 2 == 1) {
            return indexele2;
        } else {
            return (indexele1 + indexele2) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = {10, 12, 14, 16, 18, 20};

        int median = median(arr1, arr2);
        System.out.println("Median: " + median);
    }
}

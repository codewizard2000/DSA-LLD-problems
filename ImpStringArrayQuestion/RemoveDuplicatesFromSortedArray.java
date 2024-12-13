package ImpStringArrayQuestion;

import java.util.HashSet;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
//    public static int removeDuplicates(int[] arr) {
//        if (arr.length == 0) {
//            return 0;
//        }
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        int size = 0;
//        for (Integer value : set) {
//            arr[size] = value;
//            size++;
//        }
//        return size;
//    }
    // o(nlong)+o(n)
    // sc = o(n)

    public static int removeDuplicates(int[] arr){
        int i=0;
        int j=1;
        while(i<arr.length && j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            }else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }

        return i;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4}; // Example sorted array with duplicates
        int newLength = removeDuplicates(arr);

        // Print the modified array with unique elements
        for (int i = 0; i <=newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


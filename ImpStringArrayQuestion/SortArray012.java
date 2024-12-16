package ImpStringArrayQuestion;

import java.util.Arrays;

public class SortArray012 {
//    public static int[] Sort(int[] arr){
//        Arrays.sort(arr);
//        return arr;
//    }
//    // Brute force approach O(NlogN)


    public static int[] Sort(int[] arr){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            }
        }
        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            arr[index++] = 2;
        }

        return arr;
    }



    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        int[] result = Sort(arr);
        System.out.print(Arrays.toString(result));
    }

}

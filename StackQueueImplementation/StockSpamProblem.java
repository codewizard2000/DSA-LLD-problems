package StackQueueImplementation;

import java.util.Arrays;
import java.util.Stack;

public class StockSpamProblem {
    public static int[] stock(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.empty() && arr[st.peek()]<=arr[i]){
                st.pop();

            }

            if(st.empty()){
                result[i]=i+1;

            }else{
                result[i]=i-st.peek();
            }

            st.push(i);

        }
        return result;

    }

//    public static int[] stock(int[] arr) {
//        int[] result = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = i; j >= 0 ; j--) {
//                if(arr[j] <= arr[i]){
//                    count++;
//                }
//                else{
//                    break;
//                }
//            }
//            result[i] = count;
//        }
//        return result;
//    } brute force

    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 90, 120, 80};
        int[] result = stock(arr);
        System.out.println(Arrays.toString(result));
    }
}

package StackQueueImplementation;

import java.util.Stack;

public class NextGreaterelemetCircular {
    public static int[] isGreater(int[] arr){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%n]){
                st.pop();

            }
            if(i<n){
                if(!st.empty() ){
                    nge[i]=st.peek();
                }else{
                    nge[i]=-1;
                }

            }
            st.push(arr[i % n]);

        }
        return nge;
    }
    public static void main(String args[]) {
        int arr[]={5,7,1,2,6,0};

        int arr2[] = isGreater(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}

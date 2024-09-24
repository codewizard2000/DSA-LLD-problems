package StackQueueImplementation;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] Greater(int[] arr){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();

            }
            if(i<n){
                if(!st.empty() ){
                    nge[i]=st.peek();
                }else{
                    nge[i]=-1;
                }

            }
            st.push(arr[i]);

        }
        return nge;
    }
    public static void main(String args[]) {
        int arr[]={4 , 5 , 2 , 25 };

        int arr2[] = Greater(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}

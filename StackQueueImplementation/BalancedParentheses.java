package StackQueueImplementation;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }else{
                if(st.empty()){
                    return false;
                }
                char ch = st.pop();
                if(ch=='(' && c==')' || ch=='{' && c=='}' || ch=='[' && c==']'){
                    continue;
                }else{
                    return false;
                }

            }
        }
        return st.empty();

    }
    public static void main(String[] args) {
        String test1 = "({[]})";
        String test2 = "({[})";
        String test3 = "({[]})[]{}";

        System.out.println("Test 1: " + isBalanced(test1)); // Expected: true
        System.out.println("Test 2: " + isBalanced(test2)); // Expected: false
        System.out.println("Test 3: " + isBalanced(test3)); // Expected: true
    }

}

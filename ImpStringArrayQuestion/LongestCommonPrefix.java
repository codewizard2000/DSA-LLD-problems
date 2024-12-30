package ImpStringArrayQuestion;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] arr){
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        int i=0;
        int minlength = Math.min(first.length(),last.length());
        while(i<minlength && first.charAt(i)==last.charAt(i)){
            i++;
        }

        return first.substring(0,i);
    }
    public static void main(String[] args){
        String[] arr = { "geeksforgeeks", "geeks",
                "geek", "geezer" };
        System.out.print(longestCommonPrefix(arr));
    }
}

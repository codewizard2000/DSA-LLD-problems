package ImpStringArrayQuestion;

public class LargestOddNumberInString {
//    public static String findodd(String str){
////        int max =Integer.MIN_VALUE;
////        for(int i=0;i<str.length();i++){
////            if(str.charAt(i)%2!=0){
////                max = Math.max(max,str.charAt(i));
////            }
////        }
////        return (char)max;
//    }

    public static String findodd(String str) {
        // Loop through the string backwards, starting from the end
        for (int i = str.length() - 1; i >= 0; i--) {
            // Check if the current character is odd
            if (str.charAt(i) % 2 != 0) {
                // Return the substring that contains all the characters up to and including the current character
                return str.substring(0, i + 1);
            }
        }
        // If no odd number is found in the string, return an empty string
        return "";
    }
    public static void main(String[] args){
        String str = "907";
        String result = findodd(str);
        System.out.print(result);
    }
}

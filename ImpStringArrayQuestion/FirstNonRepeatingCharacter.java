package ImpStringArrayQuestion;


public class FirstNonRepeatingCharacter {
    public static char nonrepeating(String str) {
        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        for(int i=0;i<str.length();i++){
            char element = str.charAt(i);
            if(arr[element-'a']==-1){
                arr[element-'a']=i;
            }else{
                arr[element-'a']=-2;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i] >= 0) {
                min = Math.min(min, arr[i]);
            }
        }
        return (min == Integer.MAX_VALUE ? '\0' : str.charAt(min)); // Return null character if no non-repeating character is found
    }

    public static void main(String[] args) {
        String input = "geeksforgeeks";
        char result = nonrepeating(input);
        System.out.println("The first non-repeating character is: " + result);

    }
}



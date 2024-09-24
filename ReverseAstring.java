public class ReverseAstring {
    public static char[] reverse(String str){
        char[] arr = str.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            char temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args){
        String str ="rishav";
        char[] result = reverse(str);
        System.out.print(result);
    }
}

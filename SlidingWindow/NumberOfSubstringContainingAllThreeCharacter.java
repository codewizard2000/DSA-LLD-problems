package SlidingWindow;

public class NumberOfSubstringContainingAllThreeCharacter {
    public static int maxnumber(String str){
        int n=str.length();
        int[] arr = new int[]{-1,-1,-1};
        int ans = 0;
        for(int i=0;i<n;i++){
            char element = str.charAt(i);
            arr[element-'a']=i;
            int minPosition = Math.min(arr[0],Math.min(arr[1],arr[2]));
            ans = ans+minPosition+1;
        }
        return ans;
    }
    public static void main(String[] args){
        String str =  "abcabc";
        System.out.print(maxnumber(str));
    }
    //tc=o(n)
    //sc=1 because constant size
}

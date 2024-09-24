import java.util.HashSet;

public class SubarrayWithSumZero {
    public static int sum(int[] arr){
        int[] psum = new int[arr.length];
        psum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            psum[i]=psum[i-1]+arr[i];
        }
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(psum[i]==0){
                return 1;
            }else if(map.contains(psum[i])){
                return 1;
            }
            else{
                map.add(psum[i]);
            }
        }
        return 0;

    }
    public static void main(String[] args){
        int[] arr = {4,-1,1};
        int result = sum(arr);
        System.out.print(result);
    }
}

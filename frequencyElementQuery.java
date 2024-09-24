import java.util.Arrays;
import java.util.HashMap;

public class frequencyElementQuery {
    public static HashMap<Integer,Integer> frequency(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(!map.containsKey(element)){
                map.put(element,1);
            }else{
                map.put(element,map.get(element)+1);
            }
        }
        return map;
    }

    public static int[] solve(int[] arr,int[] B){
        int[] result = new int[B.length];
        HashMap<Integer,Integer> map1 = frequency(arr);
        int count=0;
        for(int i=0;i<B.length;i++){
            int element = B[i];
            if (map1.containsKey(element)) {
                result[count]=map1.get(element);
                count++;

            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {1,2,1,1};
        int[] B ={1,2};
        int[] result=solve(arr,B);
        System.out.print(Arrays.toString(result));
    }
}

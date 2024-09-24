import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CommonElement {
    public static int[] element(int[] arr, int[] B){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            map.put(element,map.getOrDefault(element,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<B.length;i++){
            int element = B[i];
            if(map.containsKey(element) && map.get(element)>0){
                map.put(element,map.get(element)-1);
                list.add(element);
            }
        }

        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }
        return resultArray;


    }
    public static void main(String[] args){
        int [] arr = {1, 2, 2, 1};
        int[] b = {2, 3, 1, 2,2};
        int[] result = element(arr,b);
        System.out.print(Arrays.toString(result));
    }
}

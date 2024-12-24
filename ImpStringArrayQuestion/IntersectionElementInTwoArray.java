package ImpStringArrayQuestion;
import java.util.*;

public class IntersectionElementInTwoArray {
    public static void intersection(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            int element  =arr1[i];
            if(!map.containsKey(element)){
                map.put(element,1);
            }else{
                map.put(element,map.get(element)+1);
            }
        }

        for(int i=0;i<arr2.length;i++){
            int element1 = arr2[i];
            if(map.containsKey(element1) && (map.get(element1)>=1)){
                System.out.print(element1+" ");
                map.put(element1,map.get(element1)-1);

            }else{
                continue;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        intersection(arr1, arr2);
    }
}

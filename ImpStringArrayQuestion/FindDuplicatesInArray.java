package ImpStringArrayQuestion;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArray {
    public static int Dduplicate(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            if(!map.containsKey(temp)){
                map.put(temp,1);
            }else{
                map.put(temp,map.get(temp)+1);
            }
        }
        for(Map.Entry<Integer,Integer> mpp: map.entrySet()){
            if(mpp.getValue()>1){
                return mpp.getKey();
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,5};
        int res = Dduplicate(arr);
        System.out.print(res);
    }
}

import java.util.Arrays;
import java.util.HashMap;

public class UniqueElement {
    public static int solve(int[] A){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<A.length;i++){
            int element=A[i];
            if(!map.containsKey(element)){
                map.put(element,1);
            }else{
                map.put(element,map.get(element)+1);
            }
        }
        for(int i=0;i<A.length;i++){
            int elemet1=A[i];
            while(map.get(elemet1)>1){
                map.put(elemet1,map.get(elemet1)-1);
                count++;
                elemet1=elemet1+1;
                map.put(elemet1,map.getOrDefault(elemet1, 0) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {2,4,5};
        int result = solve(arr);
        System.out.print(result);
    }
}

package BinarySearch;

import java.util.HashMap;
import java.util.Map;

public class findSingleElement {
    public static int find(int[] arr) {
        int low = 0;
        int high = arr.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == arr[mid ^ 1]) {//left half(ist instance even index , 2nd instance odd index )   right half (1st instance even idnex , 2nd odd) and
                low = mid + 1; // xor
            } else {
                high = mid - 1;
            }
        }
        return arr[low];
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,4,4,5,5,5};
        int result =find(arr);
        System.out.print(result);
    }
    //        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            if (!map.containsKey(temp)) {
//                map.put(temp, 1);
//            } else {
//                map.put(temp, map.get(temp) + 1);
//            }
//        }
//        int result = 0;
//        for (Map.Entry<Integer, Integer> mpp : map.entrySet()) {
//            if (mpp.getValue() == 1) {
//                result = mpp.getKey();
//            }else{
//                result=-1;
//            }
//        }
//        return result;
}

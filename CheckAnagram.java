import java.util.HashMap;

public class CheckAnagram {
    public static int anagram(String A,String B){
        if(A.length()!=B.length()){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            char element = A.charAt(i);
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        for (int i = 0; i < B.length(); i++) {
            char element1 = B.charAt(i);
            map.put(element1, map.getOrDefault(element1, 0) - 1);
        }

        for(char key:map.keySet()){
            if(map.get(key)!=0){
                return 0;
            }

        }

        return 1;

    }
    public static void main(String[] args){
        String A = "secure";
        String B = "rescue";
        int result = anagram(A,B);
        System.out.print(result);
    }

}

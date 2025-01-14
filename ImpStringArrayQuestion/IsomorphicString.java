package ImpStringArrayQuestion;

import java.util.HashMap;

public class IsomorphicString {
    public static Boolean isomorphicString(String s1, String s2){
        if (s1.length() != s2.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            if(!map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i),i);
            }
            if(!map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i),i);
            }
            if(!map1.get(s1.charAt(i)).equals(map2.get(s2.charAt(i)))){
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1="aab";
        String s2="xxz";
        System.out.print(isomorphicString(s1,s2));
    }
}

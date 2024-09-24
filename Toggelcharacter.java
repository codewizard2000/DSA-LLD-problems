public class Toggelcharacter {
    public static char[] toggle(String str){
        char[] array = str.toCharArray();
        for(int i=0;i<array.length;i++){
            char element=array[i];
            if(element>='A' && element<='Z'){
                int number = (int)(element)+32;
                array[i]=(char) number;
            }else if(element>='a' && element<='z'){
                int number = (int)(element)-32;
                array[i]=(char) number;
            }
        }
        return array;
    }
    public static void main(String[] args){
        String str = "riSHav";
        char[] toggles = toggle(str);
        System.out.print(toggles);


    }

}

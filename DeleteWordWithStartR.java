import java.util.ArrayList;


public class DeleteWordWithStartR {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("rishav");
        list.add("honey");
        list.add("babooo");

        for(int i=0;i<list.size();i++){
            if(list.get(i).startsWith("r")){
                list.remove(i);
                i--;
            }

        }
        System.out.print(list);
    }
}

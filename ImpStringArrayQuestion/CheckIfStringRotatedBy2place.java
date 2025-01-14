package ImpStringArrayQuestion;

public class CheckIfStringRotatedBy2place {
    public static Boolean checkRotation(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String anticlockWise = s1.substring(2,s1.length())+s1.substring(0,2);
        String clockWise = s1.substring(s1.length()-2,s1.length())+s1.substring(0,s1.length()-2);
        System.out.println(anticlockWise+"  anitclock");
        System.out.println(clockWise+"  clockWise");

        if(anticlockWise.equals(s2) || clockWise.equals(s2)){
            return true;
        }
        return false;

    }
    public static void main(String[] args){
        String s1 = "amazon";
        String s2 = "azonam";
        System.out.print(checkRotation(s1,s2));
    }

}

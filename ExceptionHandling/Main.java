package ExceptionHandling;

public class Main {
    public static void main(String[] args){
        try{
            int a=5;
            int b=0;
            int result = a/b;
        }catch (ArithmeticException ex){
            System.out.println("exception occured"); //way to handle runtime exception
        }


    }

}

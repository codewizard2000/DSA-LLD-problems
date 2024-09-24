package ExceptionHandling;

public class Main2 {
    public static void main(String[] args){
        Dog d = new Dog();
        try{
            d.sleep();

        }catch(InterruptedException e){//compile time exception
            System.out.println("error while excecution");

        }
    }
}

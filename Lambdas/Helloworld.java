package Lambdas;
//way to create object of class that implements functinal interface
public class Helloworld implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world");
    }
}

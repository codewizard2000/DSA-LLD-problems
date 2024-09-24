package Lambdas;

public class Main {
    public static void main(String[] args){
        Helloworld h = new Helloworld();
        Thread t=new Thread(h);
        t.start();

        Runnable r = ()->{
            System.out.println("this is rishav");
        };
        Thread t2 = new Thread(r);
        t2.start();

    }
}

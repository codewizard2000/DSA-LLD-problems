package ExceptionHandling;

public class Dog {
    public void sleep() throws InterruptedException {
        System.out.println("dog sleep");
        Thread.sleep(1000);
        System.out.println("dog woke up");
    }
}

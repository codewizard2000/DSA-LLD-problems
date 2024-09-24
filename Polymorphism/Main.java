package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Bird mySparrow = new Sparrow();
        Bird bird = new Bird();
        bird.fly();
        Sparrow s = new Sparrow();
        s.fly();

        mySparrow.fly();  // Calls Sparrow's fly method
        mySparrow.sound();  // Calls Sparrow's sound method

    }
}

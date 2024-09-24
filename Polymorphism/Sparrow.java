package Polymorphism;

public class Sparrow extends Bird{
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Sparrow chirps");
    }
}

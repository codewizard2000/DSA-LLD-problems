package Interface;

public interface Animal {
    public void eat();
    public void sleep();
    public void walk();

    public default void run(String cat){
        System.out.print(cat+"is running");

    }
}

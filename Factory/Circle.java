package Factory;

public class Circle implements Shape{
    @Override
    public void create() {
        System.out.print("Circle is created");
    }
}

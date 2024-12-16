package Factory;

public class Rectangle implements Shape{
    @Override
    public void create() {
        System.out.print("Rectangle is created");
    }
}

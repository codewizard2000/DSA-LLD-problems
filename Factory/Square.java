package Factory;

public class Square implements Shape{
    @Override
    public void create() {
        System.out.print("square is created");
    }
}

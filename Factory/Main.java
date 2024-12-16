package Factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its create method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.create();  // Output: Circle is created

        // Get an object of Square and call its create method
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.create();  // Output: Square is created

        // Get an object of Rectangle and call its create method
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.create();  // Output: Rectangle is created
    }
}

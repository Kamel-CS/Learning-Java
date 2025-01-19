public class Main {
    public static void main(String[] args) {
        // Static method call from the interface
        Shape.staticMethodExample();

        // Accessing interface constants
        System.out.println("Accessing interface constants:");
        System.out.println("DEFAULT_SIDE: " + Shape.DEFAULT_SIDE);
        System.out.println("SHAPE_TYPE: " + Shape.SHAPE_TYPE);

        // Create a Circle object
        Circle circle = new Circle(5.0);
        circle.draw(); // Call draw method
        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Circumference of the circle: " + circle.circumference());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.draw(); // Call draw method
        System.out.println("Area of the rectangle: " + rectangle.area());
        System.out.println("Perimeter of the rectangle: " + rectangle.perimeter());

        // Demonstrate default method in the interface
        circle.printShapeInfo();

        // Demonstrate private method indirectly through default method
        rectangle.demonstratePrivateMethod();
    }
}

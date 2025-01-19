// Interface defining the Shape contract
public interface Shape {
    // Fields (implicitly public, static, and final)
    int DEFAULT_SIDE = 0;
    String SHAPE_TYPE = "2D";

    // Abstract methods (implicitly public and abstract)
    void draw();    
    double area();  

    // Default method
    default void printShapeInfo() {
        System.out.println("This is a default method in the Shape interface.");
    }

    // Static method
    static void staticMethodExample() {
        System.out.println("This is a static method in the Shape interface.");
        System.out.println("Static field SHAPE_TYPE: " + SHAPE_TYPE);
    }

    // Private method
    private void helperMethod() {
        System.out.println("This is a private method, used internally in the interface.");
    }

    // Public method that uses the private method
    default void demonstratePrivateMethod() {
        System.out.println("Calling the private method from a default method:");
        helperMethod();
    }
}

// Abstract class implementing Shape interface
abstract class AbstractShape implements Shape {
    // Concrete method (specific implementation provided here)
    void displayInfo() {
        System.out.println("This is a general shape, defined in the abstract class.");
    }

    // Abstract methods from Shape interface must still be implemented by subclasses.
    // They are not implemented in this abstract class.
}

// Concrete class for Circle, extending AbstractShape
class Circle extends AbstractShape {
    private double radius; // Instance variable (specific to Circle)

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the draw method from the Shape interface
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }

    // Overriding the area method from the Shape interface
    @Override
    public double area() {
        return Math.PI * radius * radius; // Calculate and return area of the circle
    }

    // Additional method specific to Circle
    public double circumference() {
        return 2 * Math.PI * radius; // Calculate and return circumference
    }
}

// Concrete class for Rectangle, extending AbstractShape
class Rectangle extends AbstractShape {
    private double width, height; // Instance variables for dimensions

    // Constructor to initialize the dimensions
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Overriding the draw method from the Shape interface
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    // Overriding the area method from the Shape interface
    @Override
    public double area() {
        return width * height; // Calculate and return area of the rectangle
    }

    // Additional method specific to Rectangle
    public double perimeter() {
        return 2 * (width + height); // Calculate and return perimeter
    }
}

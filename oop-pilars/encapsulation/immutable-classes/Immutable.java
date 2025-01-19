// Immutable class
public final class Immutable {

    private final String name;
    private final int age;

    // Constructor to initialize the immutable fields
    public Immutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // No setters provided, making the class immutable
    

    public static void main(String[] args) {
        // Create an immutable person object
        Immutable person = new Immutable("John", 30);

        // Try to modify the fields (which should not be possible)
        // person.setName("Doe"); // Compiler error: setName method doesn't exist
        // person.setAge(35);     // Compiler error: setAge method doesn't exist

        // Accessing fields via getter methods
        System.out.println("Name: " + person.getName());  // John
        System.out.println("Age: " + person.getAge());    // 30

        // Attempting to modify the object directly will not work:
        // person.name = "Doe"; // Error: cannot assign a value to final variable 'name'
        // person.age = 35;     // Error: cannot assign a value to final variable 'age'

        // You cannot change the object's state once it’s created.
    }
}

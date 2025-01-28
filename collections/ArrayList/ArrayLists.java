import java.util.ArrayList;

public class ArrayLists {
    
    public static void main(String[] args) {
        
        // Create an ArrayList object
        ArrayList<String> cars = new ArrayList<String>();

        // Add elements to it
        cars.add("Mercedes");
        cars.add("Peugeot");
        cars.add("Fiat");
        cars.add("BMW");
        cars.add("Audi");

        // Access elements
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        
        // Change an element
        cars.set(1, "Toyota");
        
        // Remove an element
        cars.remove("Fiat");    // or use the index

        // Iterate over the ArrayList
        for (String car: cars)
            System.out.println(car);
    }
}

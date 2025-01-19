import java.util.Iterator;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Obtain an Iterator for the ArrayList
        Iterator<String> iterator = names.iterator();

        System.out.println("Iterating through the ArrayList:");
        while (iterator.hasNext()) { // Check if there are more elements
            String name = iterator.next(); // Get the next element
            System.out.println(name);

            // Remove an element during iteration (optional)
            if (name.equals("Bob")) {
                iterator.remove(); // Removes "Bob" from the ArrayList
                System.out.println("\"Bob\" has been removed.");
            }
        }

        // Show the remaining elements in the ArrayList after iteration
        System.out.println("\nRemaining elements in the ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }
    }    
}

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals() and hashCode() for proper key comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class HashMaps {

    public static void main(String[] args) {

        // Create a HashMap with Person as the key and String as the value
        HashMap<Person, String> personJobMap = new HashMap<>();

        // Add key-value pairs
        Person person1 = new Person("Person1", 25);
        Person person2 = new Person("Person2", 30);
        Person person3 = new Person("Person3", 35);

        personJobMap.put(person1, "Engineer");
        personJobMap.put(person2, "Doctor");
        personJobMap.put(person3, "Accountant");

        // Add a null key and null value
        personJobMap.put(null, "Unemployed"); // Null key
        personJobMap.put(new Person("Person4", 40), null); // Null value

        // 1. Retrieve values from the HashMap
        System.out.println("Person1's job: " + personJobMap.get(person1)); // Output: Engineer
        System.out.println("Null key's value: " + personJobMap.get(null)); // Output: Unemployed
        System.out.println("Person4's job: " + personJobMap.get(new Person("Person4", 40))); // Output: null

        // 2. Update a value in the HashMap
        personJobMap.put(person1, "Senior Engineer"); // Update Person1's job
        System.out.println("Updated Person1's job: " + personJobMap.get(person1)); // Output: Senior Engineer

        // 3. Remove a key-value pair from the HashMap
        personJobMap.remove(person2); // Remove Person2
        System.out.println("Person2's job after removal: " + personJobMap.get(person2)); // Output: null

        // 4. Check if a key or value exists in the HashMap
        System.out.println("Contains key Person1? " + personJobMap.containsKey(person1)); // Output: true
        System.out.println("Contains value 'Accountant'? " + personJobMap.containsValue("Accountant")); // Output: true

        // 5. Iterate over the HashMap to display all key-value pairs
        System.out.println("\nAll key-value pairs:");
        for (Map.Entry<Person, String> entry : personJobMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 6. Check the size of the HashMap and clear it
        System.out.println("\nSize of HashMap: " + personJobMap.size()); // Output: 4
        personJobMap.clear(); // Clear the HashMap
        System.out.println("Size after clearing: " + personJobMap.size()); // Output: 0
    }
}

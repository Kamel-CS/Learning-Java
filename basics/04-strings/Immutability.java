public class Immutability {
    public static void main(String[] args) {
        String str = "Hello"; // Original string

        // Modify the string
        String modifiedStr = str.concat(", World!");

        // Outputs
        System.out.println("Original String: " + str);  // "Hello"
        System.out.println("Modified String: " + modifiedStr); // "Hello, World!"
    }
}

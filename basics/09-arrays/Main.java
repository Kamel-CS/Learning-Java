import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt(); 
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element n" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("[");
        for (int number: numbers) {
            System.out.print(number + " ");
        }
        System.out.print("]");

        // Find and Print the Largest Number
        int largest = numbers[0];
        int smallest = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("\nLargest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Sum of all elements: " + sum);

        scanner.close();
    }
}

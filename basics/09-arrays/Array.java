import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 5, -8, -22, 49, 0, 1};
        
        // Print original array
        System.out.println(Arrays.toString(numbers));

        // Create a copy of the array
        int[] sortedArray = Arrays.copyOf(numbers, numbers.length);

        // Sort the copy
        Arrays.sort(sortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

        // Reverse the Sorted Array
        int size = numbers.length;
        int[] reversed = new int[size];
        for (int i = 0; i < size; i++) {
            reversed[i] = sortedArray[size - 1 - i]; // Reverse the sorted array
        }
        System.out.println("Reversed Array: " + Arrays.toString(reversed));   
    }
}

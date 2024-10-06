import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.println("The number is: " + (n % 2 == 0 ? "even" : "odd"));
    }
}

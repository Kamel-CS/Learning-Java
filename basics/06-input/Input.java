import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = scanner.nextLine();

        System.out.print("Your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Your favourite food: ");
        String food = scanner.nextLine();
        
        System.out.println("\nHello " + name);
        System.out.println("You are " + age);
        System.out.println("Do you really like " + food + "?");
    }
}

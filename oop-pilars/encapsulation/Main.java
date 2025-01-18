import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new customer account
        CustomerAccount account = new CustomerAccount("Random Bro", "ACC123", 5000);

        // Display account details
        System.out.println("Account Details:");
        System.out.println(account);

        // Deposit money
        System.out.print("\nEnter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        if (account.deposit(depositAmount)) {
            System.out.println("Deposit successful!");
        }
        System.out.println(account);

        // Withdraw money
        System.out.print("\nEnter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        if (account.withdraw(withdrawalAmount)) {
            System.out.println("Withdrawal successful!");
        }
        System.out.println(account);

        // Update account holder name
        System.out.print("\nEnter new account holder name: ");
        scanner.nextLine(); // Consume newline
        String newName = scanner.nextLine();
        account.setAccountHolderName(newName);

        // Display updated details
        System.out.println("\nUpdated Account Details:");
        System.out.println(account);

        scanner.close();
    }
}

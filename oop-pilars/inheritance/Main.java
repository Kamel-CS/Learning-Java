import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int accountNumber = (int) (Math.random() * 1001);   // Random integer between 0 and 1000

        StudentAccount  studentAccount = new StudentAccount("Kamel Demri", accountNumber, 15000 , "UMBB");

        System.out.println("Student Account:==============");
        System.out.println(studentAccount);
        System.out.println("==============================");

        System.out.print("\nEnter the amount to deposit: ");
        double amount = scanner.nextDouble();
        studentAccount.deposit(amount);
        System.out.println(studentAccount);

        System.out.print("\nEnter the amount to withdraw: ");
        amount = scanner.nextDouble();
        studentAccount.withdraw(amount);
        System.out.println(studentAccount);

        scanner.close();
    }
}

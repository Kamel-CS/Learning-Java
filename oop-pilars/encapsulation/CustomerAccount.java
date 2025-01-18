public class CustomerAccount {
    // Private fields ensure Encapsulation
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public CustomerAccount(String accountHolderName, String accountNumber, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        if (initialDeposit >= 0)
            this.balance = initialDeposit;
        else {
            System.out.println("Initial Deposit cannot be negative!");
            this.balance = 0.0;
        }
    }

    // getter and setter for holder's name
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.isEmpty())
            this.accountHolderName = accountHolderName;
        else
            System.out.println("Invalid name! Name not updated.");
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for account number (read-only, no setter)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance (read-only, no setter)
    public double getBalance() {
        return balance;
    }

    // Method to deposit money with validation
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            System.out.println("Deposit amount must be positive.");
            return false;
        }
    }

    // Method to withdraw money with validation
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }

    // Override default implementation
    @Override
    public String toString() {
        return "Account Holder: " + accountHolderName +
               "\nAccount Number: " + accountNumber +
               "\nBalance: " + balance;
    }
}

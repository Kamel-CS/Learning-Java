class BankAccount {
    
    private String accountHolder;
    private int accountNumber;
    protected double balance;   // allow derived (sub) classes to access

    BankAccount (String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount + 50 ) {
            balance -= amount;
            balance -= 50;  // fees
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account Holder: " + accountHolder
        + "\nAccount Number: " + accountNumber
        + "\nBalance: " + balance + "DA";
    }

    // Encapsulation
    String getAccountHolder() {
        return accountHolder;
    }

    int getAccountNumber() {
        return accountNumber;
    }
}


class StudentAccount extends BankAccount {
    private String universityName;

    StudentAccount(String accountHolder, int accountNumber, double balance, String universityName) {
        super(accountHolder, accountNumber, balance);
        this.universityName = universityName;
    }

    String getUniversityName() {
        return universityName;
    }

    // no fees for students
    @Override
    boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUniversity: " + universityName;
    }
}

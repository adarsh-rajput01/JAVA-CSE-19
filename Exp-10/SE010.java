abstract class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    abstract void calculateInterest();
}

class SavingAccount extends BankAccount {
    SavingAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Saving Account Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    void calculateInterest() {
        double interest = balance * 0.02;
        System.out.println("Current Account Interest: " + interest);
    }
}

public class SEO10 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(102, "Tahir", 10000);
        CurrentAccount ca = new CurrentAccount(103, "Tahir", 20000);

        System.out.println("--- Saving Account ---");
        sa.displayDetails();
        sa.deposit(500);
        sa.calculateInterest();

        System.out.println("--- Current Account ---");
        ca.displayDetails();
        ca.deposit(1000);
        ca.calculateInterest();
    }
}

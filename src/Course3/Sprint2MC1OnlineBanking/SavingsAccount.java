package Course3.Sprint2MC1OnlineBanking;

public class SavingsAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountStatus;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolderName, double balance, String accountStatus) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountStatus = accountStatus;
    }

    // Method to retrieve the account balance
    public double getBalance() {
        return balance;
    }

    // Method to debit cash from the account
    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " has been debited from the account.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to credit cash to the account
    public void credit(double amount) {
        balance += amount;
        System.out.println(amount + " has been credited to the account.");
    }
}


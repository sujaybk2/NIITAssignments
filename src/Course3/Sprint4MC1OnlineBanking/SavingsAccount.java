package Course3.Sprint4MC1OnlineBanking;

public class SavingsAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private String accountStatus;

    public SavingsAccount(String accountNumber, String accountHolderName, double accountBalance, String accountStatus) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void debitCash(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            System.out.println("Successfully debited: " + amount);
        } else {
            System.out.println("Insufficient balance. Debit unsuccessful.");
        }
    }

    public void creditCash(double amount) {
        accountBalance += amount;
        System.out.println("Successfully credited: " + amount);
    }
}

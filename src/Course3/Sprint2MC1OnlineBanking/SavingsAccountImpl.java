package Course3.Sprint2MC1OnlineBanking;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        // Create an object of SavingsAccount class
        SavingsAccount account = new SavingsAccount("123456789012", "John Doe", 1000.0, "Active");

        // Retrieve the balance
        double balance = account.getBalance();
        System.out.println("Account balance: " + balance);

        // Debit some amount
        account.debit(500.0);

        // Credit some amount
        account.credit(200.0);
    }
}

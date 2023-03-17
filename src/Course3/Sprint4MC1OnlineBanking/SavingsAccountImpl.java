package Course3.Sprint4MC1OnlineBanking;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123456789012", "John Smith", 5000, "Active");

        System.out.println("Account balance: " + savingsAccount.getAccountBalance());
        savingsAccount.debitCash(1000);
        System.out.println("Account balance: " + savingsAccount.getAccountBalance());
        savingsAccount.creditCash(2000);
        System.out.println("Account balance: " + savingsAccount.getAccountBalance());

        return;
    }
}

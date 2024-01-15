package Activity1;

public class BankAccountDemo {
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount account1 = new BankAccount("Benson", 1000, 5.0); // 5% annual interest
        BankAccount account2 = new BankAccount("Mathew", 500, 3.0); // 3% annual interest

        // Display initial account information
        System.out.println("Initial Account Information: ");
        System.out.println(account1);
        System.out.println(account2);

        // Perform some transactions
        account1.deposit(200);
        account2.withdraw(50);
        account1.transfer(account2, 300);

        // Apply annual interest
        account1.annualInterest();
        account2.annualInterest();

        // Display updated account information
        System.out.println("\nUpdated Account Information:");
        System.out.println(account1);
        System.out.println(account2);
    }
}

package Activity1;

public class BankAccount {
    private double balance;
    private int transactions;
    private String holderName;
    private double interestRate; // Annual interest rate in percentage

    // Constructor with account holder's name and initial balance
    public BankAccount(String holderName, double initial, double interestRate) {
        this.holderName = holderName;
        this.balance = initial;
        this.interestRate = interestRate / 100; // Convert interest rate to a decimal
        this.transactions = 1;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        transactions++;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions++;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Apply annual interest
    public void annualInterest() {
        balance += balance * interestRate;
        transactions++;
    }

    // Method to transfer money to another bank account
    public void transfer(BankAccount recipient, double amount) {
        if (balance >= amount + 0.5) {
            balance -= (amount + 0.5);
            recipient.deposit(amount);
            transactions += 2; // Two transactions: one withdrawal and one deposit
        } else {
            System.out.println("Insufficient funds to transfer.");
        }
    }

    // toString method to represent the account information
    public String toString() {
        String balanceString;
        if (balance < 0) {
            balanceString = String.format("-$%.2f", Math.abs(balance));
        } else {
            balanceString = String.format("$%.2f", balance);
        }
        return holderName + ", " + balanceString;
    }

    // A method to get the current balance
    public double getBalance() {
        return balance;
    }
}

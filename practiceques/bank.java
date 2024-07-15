package practiceques;

public class bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1234567, "Asrim", 100000);
        BankAccount account2 = new BankAccount(31231231, "Kimtii", 99999);

        account1.withdraw(5000);
        account1.deposit(20000);
        account1.checkBalance();

        account2.withdraw(10000);
        account2.deposit(5000);
        account2.checkBalance();
    }
}
/*Create a BankAccount class to simulate a bank account. The class should have the
following attributes: account number, account holder name, and balance.
\lnclude methods to deposit(), withdraw(), and checkBalance().
Implement functionality to
- Create new accounts
- Deposit money into the account
- Withdraw money
- Check the account balance. */

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited Rs. " + amount + ". New Balance: Rs. " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn Rs. " + amount + ". New balance: Rs. " + this.balance);
        } else {
            System.out.println("Insufficient balance: Rs. " + this.balance);
        }
    }

    public void checkBalance() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Current Balance: Rs. " + this.balance);
    }
}
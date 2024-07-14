package practiceques;

public class Transaction{
    public static void main(String[] args) {
        Transactions depositTransaction = new depositTransaction(500000, 700000);
        transactionProcessor.processTransaction(depositTransaction);

        Transactions withdrawTransaction = new withdrawalTransaction(50000, 100000);
        transactionProcessor.processTransaction(withdrawTransaction);
    }
}
/*Question Design and implement a Java program that simulates a financial transaction
system. Your system should be capable of processing different types of transactions,
such as deposits and withdrawals, and alerting if any transactions exceed certain limits.
Use interfaces to define common behaviors for transactions and implement these
behaviors in different transaction classes.
Create an interface named Transaction with at least two methods:
getAmount() which returns the amount of the transaction as a double
isValid() which returns a boolean indicating if the transaction is valid based on certain
criteria.
Implement the Transaction interface in at least three separate classes,
DepositTransaction and WithdrawalTransaction. Each class should have a constructor
that sets a limit for transactions and specific logic to determine if the transaction is valid. */

interface Transactions {
    double getAmount();
    boolean isValid();
}

class depositTransaction implements Transactions{
    private double amount;
    private double limit;

    public depositTransaction(double amount,double limit){
        this.amount = amount;
        this.limit = limit;
    }
    @Override
    public double getAmount(){
        return amount;
    }
    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}
class withdrawalTransaction implements Transactions{
    private double amount;
    private double limit;

    public withdrawalTransaction(double amount, double limit) {
        this.amount = amount;
        this.limit = limit;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public boolean isValid() {
        return amount <= limit;
    }
}

class transactionProcessor{
    public static void processTransaction(Transactions transaction){
        if (transaction.isValid()) {
            System.out.println("Transaction complete " +transaction.getAmount() );
        }
        else{
            System.out.println("Transaction incomplete.Limit exceeded");
        }
    }
}
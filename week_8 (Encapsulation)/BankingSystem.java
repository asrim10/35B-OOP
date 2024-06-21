public class BankingSystem {
    public static void main(String[] args) {
   BankAccount ba= new BankAccount("101930", "Asrim", 9999999);
   System.out.println(ba.getBalance());
   ba.deposit(99);
   System.out.println(ba.getBalance());
   ba.withdraw(100000);
   System.out.println(ba.getBalance());
   ba.withdraw(99999999);
   System.out.println(ba.getBalance());
}
}
// You are building a banking application that has a BankAccount class. 
// Implement the BankAccount class with encapsulation principles in mind. 
// Include private instance variables for the
// account number, account holder name, and account balance. 
// Provide public methods to allow clients to deposit and withdraw funds, 
// as well as access the account balance. 
// Ensure that the account balance cannot be accessed or modified directly.
// Ensure that user cannot withdraw balance if it can go to negative
// Note make contructor to fill the attribute on account opening
// Make getter for account number and account holder name 
class BankAccount{
    private String accountNumber;
    private String accountHolder;
    private double accountBalance;

    BankAccount(String accountNumber, String accountHolder, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }
    public void deposit(double Money){
        this.accountBalance += Money;
    }
    public void withdraw(double money){
        if(money > accountBalance){
            System.out.println("You are poor");
        }
        else{
            this.accountBalance -=money;
            System.out.println("Withdrawn");
        }
    }
    public double getBalance(){
        return this.accountBalance;
    }
    public String getNumber(){
        return this.accountNumber;
    }
    public String getName(){
        return this.accountHolder;
    }

}
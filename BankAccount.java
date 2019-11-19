
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private double balance;
    /**Constructs a bank accoubt with a given balance
     @param initialBalance must be a double
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance; 
    }
    /**
       Deposits money into the bank account.
       @param amount double of the amount that will be deposited
     */
    public void deposit(double amount)
    {
        if (amount >= 0){
            balance = balance + amount;
        }
        else{
            System.out.println("invalid input: " + amount);
        }
    }
    /**
     * Withdraws money from the bank account
     * @param amount to withdraw
     */ 
    public void withdraw(double amount)
    {
        if (amount <= balance){
            balance = balance - amount;
        }
        else{
            System.out.println("OVERDRAWN cannot withdraw: " + amount + " dollars");
        }
    }
    /**
     * Gets current balance of the account
     *  @return the current balance
     */ 
    public double getBalance()
    {
        return balance;
    }
    /**
     * Gives an interest rate
     * @param rate the rate of interest
     * 
     */
    public void addInterest(double rate)
    {
        balance = balance + (balance * rate);
    }

}

/**
 * Write a description of class BankAccountTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccountTester
{
    public static void main(String[]args){
        BankAccount one = new BankAccount(0);
        one.deposit(300);//deposits 300
        one.deposit(-100);//Testing with and invalid input
        one.withdraw(100);//withdraws 100
        one.withdraw(1000);//Testing with an amount that will overdraw
        System.out.println("The Balance of Your account is: $" + one.getBalance());//Prints Balance
    }
}
